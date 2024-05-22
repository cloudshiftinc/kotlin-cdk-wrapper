@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.IInterfaceVpcEndpoint
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Construction properties for a SecretRotation.
 *
 * Example:
 *
 * ```
 * Secret myUserSecret;
 * Secret myMasterSecret;
 * IConnectable myDatabase;
 * Vpc myVpc;
 * SecretRotation.Builder.create(this, "SecretRotation")
 * .application(SecretRotationApplication.MYSQL_ROTATION_MULTI_USER)
 * .secret(myUserSecret) // The secret that will be rotated
 * .masterSecret(myMasterSecret) // The secret used for the rotation
 * .target(myDatabase)
 * .vpc(myVpc)
 * .build();
 * ```
 */
public interface SecretRotationProps {
  /**
   * The serverless application for the rotation.
   */
  public fun application(): SecretRotationApplication

  /**
   * Specifies the number of days after the previous rotation before Secrets Manager triggers the
   * next automatic rotation.
   *
   * Default: Duration.days(30)
   */
  public fun automaticallyAfter(): Duration? =
      unwrap(this).getAutomaticallyAfter()?.let(Duration::wrap)

  /**
   * The VPC interface endpoint to use for the Secrets Manager API.
   *
   * If you enable private DNS hostnames for your VPC private endpoint (the default), you don't
   * need to specify an endpoint. The standard Secrets Manager DNS hostname the Secrets Manager
   * CLI and SDKs use by default (https://secretsmanager.<region>.amazonaws.com) automatically
   * resolves to your VPC endpoint.
   *
   * Default: https://secretsmanager.<region>.amazonaws.com
   */
  public fun endpoint(): IInterfaceVpcEndpoint? =
      unwrap(this).getEndpoint()?.let(IInterfaceVpcEndpoint::wrap)

  /**
   * Characters which should not appear in the generated password.
   *
   * Default: - no additional characters are explicitly excluded
   */
  public fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

  /**
   * The master secret for a multi user rotation scheme.
   *
   * Default: - single user rotation scheme
   */
  public fun masterSecret(): ISecret? = unwrap(this).getMasterSecret()?.let(ISecret::wrap)

  /**
   * Specifies whether to rotate the secret immediately or wait until the next scheduled rotation
   * window.
   *
   * Default: true
   */
  public fun rotateImmediatelyOnUpdate(): Boolean? = unwrap(this).getRotateImmediatelyOnUpdate()

  /**
   * The secret to rotate. It must be a JSON string with the following format:.
   *
   * ```
   * {
   * "engine": &lt;required: database engine&gt;,
   * "host": &lt;required: instance host name&gt;,
   * "username": &lt;required: username&gt;,
   * "password": &lt;required: password&gt;,
   * "dbname": &lt;optional: database name&gt;,
   * "port": &lt;optional: if not specified, default port will be used&gt;,
   * "masterarn": &lt;required for multi user rotation: the arn of the master secret which will be
   * used to create users/change passwords&gt;
   * }
   * ```
   *
   * This is typically the case for a secret referenced from an
   * `AWS::SecretsManager::SecretTargetAttachment`
   * or an `ISecret` returned by the `attach()` method of `Secret`.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secrettargetattachment.html)
   */
  public fun secret(): ISecret

  /**
   * The security group for the Lambda rotation function.
   *
   * Default: - a new security group is created
   */
  public fun securityGroup(): ISecurityGroup? =
      unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

  /**
   * The target service or database.
   */
  public fun target(): IConnectable

  /**
   * The VPC where the Lambda rotation function will run.
   */
  public fun vpc(): IVpc

  /**
   * The type of subnets in the VPC where the Lambda rotation function will run.
   *
   * Default: - the Vpc default strategy if not specified.
   */
  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  /**
   * A builder for [SecretRotationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param application The serverless application for the rotation. 
     */
    public fun application(application: SecretRotationApplication)

    /**
     * @param automaticallyAfter Specifies the number of days after the previous rotation before
     * Secrets Manager triggers the next automatic rotation.
     */
    public fun automaticallyAfter(automaticallyAfter: Duration)

    /**
     * @param endpoint The VPC interface endpoint to use for the Secrets Manager API.
     * If you enable private DNS hostnames for your VPC private endpoint (the default), you don't
     * need to specify an endpoint. The standard Secrets Manager DNS hostname the Secrets Manager
     * CLI and SDKs use by default (https://secretsmanager.<region>.amazonaws.com) automatically
     * resolves to your VPC endpoint.
     */
    public fun endpoint(endpoint: IInterfaceVpcEndpoint)

    /**
     * @param excludeCharacters Characters which should not appear in the generated password.
     */
    public fun excludeCharacters(excludeCharacters: String)

    /**
     * @param masterSecret The master secret for a multi user rotation scheme.
     */
    public fun masterSecret(masterSecret: ISecret)

    /**
     * @param rotateImmediatelyOnUpdate Specifies whether to rotate the secret immediately or wait
     * until the next scheduled rotation window.
     */
    public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean)

    /**
     * @param secret The secret to rotate. It must be a JSON string with the following format:. 
     * ```
     * {
     * "engine": &lt;required: database engine&gt;,
     * "host": &lt;required: instance host name&gt;,
     * "username": &lt;required: username&gt;,
     * "password": &lt;required: password&gt;,
     * "dbname": &lt;optional: database name&gt;,
     * "port": &lt;optional: if not specified, default port will be used&gt;,
     * "masterarn": &lt;required for multi user rotation: the arn of the master secret which will be
     * used to create users/change passwords&gt;
     * }
     * ```
     *
     * This is typically the case for a secret referenced from an
     * `AWS::SecretsManager::SecretTargetAttachment`
     * or an `ISecret` returned by the `attach()` method of `Secret`.
     */
    public fun secret(secret: ISecret)

    /**
     * @param securityGroup The security group for the Lambda rotation function.
     */
    public fun securityGroup(securityGroup: ISecurityGroup)

    /**
     * @param target The target service or database. 
     */
    public fun target(target: IConnectable)

    /**
     * @param vpc The VPC where the Lambda rotation function will run. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * @param vpcSubnets The type of subnets in the VPC where the Lambda rotation function will run.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * @param vpcSubnets The type of subnets in the VPC where the Lambda rotation function will run.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e08e6521951ebfb68ba16766c4654abe8eb935963f2e5e8eb407ccfd22f4c5f0")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.SecretRotationProps.Builder =
        software.amazon.awscdk.services.secretsmanager.SecretRotationProps.builder()

    /**
     * @param application The serverless application for the rotation. 
     */
    override fun application(application: SecretRotationApplication) {
      cdkBuilder.application(application.let(SecretRotationApplication.Companion::unwrap))
    }

    /**
     * @param automaticallyAfter Specifies the number of days after the previous rotation before
     * Secrets Manager triggers the next automatic rotation.
     */
    override fun automaticallyAfter(automaticallyAfter: Duration) {
      cdkBuilder.automaticallyAfter(automaticallyAfter.let(Duration.Companion::unwrap))
    }

    /**
     * @param endpoint The VPC interface endpoint to use for the Secrets Manager API.
     * If you enable private DNS hostnames for your VPC private endpoint (the default), you don't
     * need to specify an endpoint. The standard Secrets Manager DNS hostname the Secrets Manager
     * CLI and SDKs use by default (https://secretsmanager.<region>.amazonaws.com) automatically
     * resolves to your VPC endpoint.
     */
    override fun endpoint(endpoint: IInterfaceVpcEndpoint) {
      cdkBuilder.endpoint(endpoint.let(IInterfaceVpcEndpoint.Companion::unwrap))
    }

    /**
     * @param excludeCharacters Characters which should not appear in the generated password.
     */
    override fun excludeCharacters(excludeCharacters: String) {
      cdkBuilder.excludeCharacters(excludeCharacters)
    }

    /**
     * @param masterSecret The master secret for a multi user rotation scheme.
     */
    override fun masterSecret(masterSecret: ISecret) {
      cdkBuilder.masterSecret(masterSecret.let(ISecret.Companion::unwrap))
    }

    /**
     * @param rotateImmediatelyOnUpdate Specifies whether to rotate the secret immediately or wait
     * until the next scheduled rotation window.
     */
    override fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean) {
      cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate)
    }

    /**
     * @param secret The secret to rotate. It must be a JSON string with the following format:. 
     * ```
     * {
     * "engine": &lt;required: database engine&gt;,
     * "host": &lt;required: instance host name&gt;,
     * "username": &lt;required: username&gt;,
     * "password": &lt;required: password&gt;,
     * "dbname": &lt;optional: database name&gt;,
     * "port": &lt;optional: if not specified, default port will be used&gt;,
     * "masterarn": &lt;required for multi user rotation: the arn of the master secret which will be
     * used to create users/change passwords&gt;
     * }
     * ```
     *
     * This is typically the case for a secret referenced from an
     * `AWS::SecretsManager::SecretTargetAttachment`
     * or an `ISecret` returned by the `attach()` method of `Secret`.
     */
    override fun secret(secret: ISecret) {
      cdkBuilder.secret(secret.let(ISecret.Companion::unwrap))
    }

    /**
     * @param securityGroup The security group for the Lambda rotation function.
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup.Companion::unwrap))
    }

    /**
     * @param target The target service or database. 
     */
    override fun target(target: IConnectable) {
      cdkBuilder.target(target.let(IConnectable.Companion::unwrap))
    }

    /**
     * @param vpc The VPC where the Lambda rotation function will run. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    /**
     * @param vpcSubnets The type of subnets in the VPC where the Lambda rotation function will run.
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * @param vpcSubnets The type of subnets in the VPC where the Lambda rotation function will run.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e08e6521951ebfb68ba16766c4654abe8eb935963f2e5e8eb407ccfd22f4c5f0")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.secretsmanager.SecretRotationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.secretsmanager.SecretRotationProps,
  ) : CdkObject(cdkObject), SecretRotationProps {
    /**
     * The serverless application for the rotation.
     */
    override fun application(): SecretRotationApplication =
        unwrap(this).getApplication().let(SecretRotationApplication::wrap)

    /**
     * Specifies the number of days after the previous rotation before Secrets Manager triggers the
     * next automatic rotation.
     *
     * Default: Duration.days(30)
     */
    override fun automaticallyAfter(): Duration? =
        unwrap(this).getAutomaticallyAfter()?.let(Duration::wrap)

    /**
     * The VPC interface endpoint to use for the Secrets Manager API.
     *
     * If you enable private DNS hostnames for your VPC private endpoint (the default), you don't
     * need to specify an endpoint. The standard Secrets Manager DNS hostname the Secrets Manager
     * CLI and SDKs use by default (https://secretsmanager.<region>.amazonaws.com) automatically
     * resolves to your VPC endpoint.
     *
     * Default: https://secretsmanager.<region>.amazonaws.com
     */
    override fun endpoint(): IInterfaceVpcEndpoint? =
        unwrap(this).getEndpoint()?.let(IInterfaceVpcEndpoint::wrap)

    /**
     * Characters which should not appear in the generated password.
     *
     * Default: - no additional characters are explicitly excluded
     */
    override fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

    /**
     * The master secret for a multi user rotation scheme.
     *
     * Default: - single user rotation scheme
     */
    override fun masterSecret(): ISecret? = unwrap(this).getMasterSecret()?.let(ISecret::wrap)

    /**
     * Specifies whether to rotate the secret immediately or wait until the next scheduled rotation
     * window.
     *
     * Default: true
     */
    override fun rotateImmediatelyOnUpdate(): Boolean? = unwrap(this).getRotateImmediatelyOnUpdate()

    /**
     * The secret to rotate. It must be a JSON string with the following format:.
     *
     * ```
     * {
     * "engine": &lt;required: database engine&gt;,
     * "host": &lt;required: instance host name&gt;,
     * "username": &lt;required: username&gt;,
     * "password": &lt;required: password&gt;,
     * "dbname": &lt;optional: database name&gt;,
     * "port": &lt;optional: if not specified, default port will be used&gt;,
     * "masterarn": &lt;required for multi user rotation: the arn of the master secret which will be
     * used to create users/change passwords&gt;
     * }
     * ```
     *
     * This is typically the case for a secret referenced from an
     * `AWS::SecretsManager::SecretTargetAttachment`
     * or an `ISecret` returned by the `attach()` method of `Secret`.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-secrettargetattachment.html)
     */
    override fun secret(): ISecret = unwrap(this).getSecret().let(ISecret::wrap)

    /**
     * The security group for the Lambda rotation function.
     *
     * Default: - a new security group is created
     */
    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

    /**
     * The target service or database.
     */
    override fun target(): IConnectable = unwrap(this).getTarget().let(IConnectable::wrap)

    /**
     * The VPC where the Lambda rotation function will run.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    /**
     * The type of subnets in the VPC where the Lambda rotation function will run.
     *
     * Default: - the Vpc default strategy if not specified.
     */
    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SecretRotationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.SecretRotationProps):
        SecretRotationProps = CdkObjectWrappers.wrap(cdkObject) as? SecretRotationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecretRotationProps):
        software.amazon.awscdk.services.secretsmanager.SecretRotationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.secretsmanager.SecretRotationProps
  }
}
