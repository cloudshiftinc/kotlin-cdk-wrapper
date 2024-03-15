@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.IInterfaceVpcEndpoint
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Secret rotation for a service or database.
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
public open class SecretRotation internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.secretsmanager.SecretRotation,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.secretsmanager.SecretRotation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The serverless application for the rotation.
     *
     * @param application The serverless application for the rotation. 
     */
    public fun application(application: SecretRotationApplication)

    /**
     * Specifies the number of days after the previous rotation before Secrets Manager triggers the
     * next automatic rotation.
     *
     * Default: Duration.days(30)
     *
     * @param automaticallyAfter Specifies the number of days after the previous rotation before
     * Secrets Manager triggers the next automatic rotation. 
     */
    public fun automaticallyAfter(automaticallyAfter: Duration)

    /**
     * The VPC interface endpoint to use for the Secrets Manager API.
     *
     * If you enable private DNS hostnames for your VPC private endpoint (the default), you don't
     * need to specify an endpoint. The standard Secrets Manager DNS hostname the Secrets Manager
     * CLI and SDKs use by default (https://secretsmanager.<region>.amazonaws.com) automatically
     * resolves to your VPC endpoint.
     *
     * Default: https://secretsmanager.<region>.amazonaws.com
     *
     * @param endpoint The VPC interface endpoint to use for the Secrets Manager API. 
     */
    public fun endpoint(endpoint: IInterfaceVpcEndpoint)

    /**
     * Characters which should not appear in the generated password.
     *
     * Default: - no additional characters are explicitly excluded
     *
     * @param excludeCharacters Characters which should not appear in the generated password. 
     */
    public fun excludeCharacters(excludeCharacters: String)

    /**
     * The master secret for a multi user rotation scheme.
     *
     * Default: - single user rotation scheme
     *
     * @param masterSecret The master secret for a multi user rotation scheme. 
     */
    public fun masterSecret(masterSecret: ISecret)

    /**
     * Specifies whether to rotate the secret immediately or wait until the next scheduled rotation
     * window.
     *
     * Default: true
     *
     * @param rotateImmediatelyOnUpdate Specifies whether to rotate the secret immediately or wait
     * until the next scheduled rotation window. 
     */
    public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean)

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
     * @param secret The secret to rotate. It must be a JSON string with the following format:. 
     */
    public fun secret(secret: ISecret)

    /**
     * The security group for the Lambda rotation function.
     *
     * Default: - a new security group is created
     *
     * @param securityGroup The security group for the Lambda rotation function. 
     */
    public fun securityGroup(securityGroup: ISecurityGroup)

    /**
     * The target service or database.
     *
     * @param target The target service or database. 
     */
    public fun target(target: IConnectable)

    /**
     * The VPC where the Lambda rotation function will run.
     *
     * @param vpc The VPC where the Lambda rotation function will run. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * The type of subnets in the VPC where the Lambda rotation function will run.
     *
     * Default: - the Vpc default strategy if not specified.
     *
     * @param vpcSubnets The type of subnets in the VPC where the Lambda rotation function will run.
     * 
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * The type of subnets in the VPC where the Lambda rotation function will run.
     *
     * Default: - the Vpc default strategy if not specified.
     *
     * @param vpcSubnets The type of subnets in the VPC where the Lambda rotation function will run.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("136a5ed61cdfb22b58b54793b40c1245b6ae240baad9a465918841ea64c85530")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.secretsmanager.SecretRotation.Builder =
        software.amazon.awscdk.services.secretsmanager.SecretRotation.Builder.create(scope, id)

    /**
     * The serverless application for the rotation.
     *
     * @param application The serverless application for the rotation. 
     */
    override fun application(application: SecretRotationApplication) {
      cdkBuilder.application(application.let(SecretRotationApplication::unwrap))
    }

    /**
     * Specifies the number of days after the previous rotation before Secrets Manager triggers the
     * next automatic rotation.
     *
     * Default: Duration.days(30)
     *
     * @param automaticallyAfter Specifies the number of days after the previous rotation before
     * Secrets Manager triggers the next automatic rotation. 
     */
    override fun automaticallyAfter(automaticallyAfter: Duration) {
      cdkBuilder.automaticallyAfter(automaticallyAfter.let(Duration::unwrap))
    }

    /**
     * The VPC interface endpoint to use for the Secrets Manager API.
     *
     * If you enable private DNS hostnames for your VPC private endpoint (the default), you don't
     * need to specify an endpoint. The standard Secrets Manager DNS hostname the Secrets Manager
     * CLI and SDKs use by default (https://secretsmanager.<region>.amazonaws.com) automatically
     * resolves to your VPC endpoint.
     *
     * Default: https://secretsmanager.<region>.amazonaws.com
     *
     * @param endpoint The VPC interface endpoint to use for the Secrets Manager API. 
     */
    override fun endpoint(endpoint: IInterfaceVpcEndpoint) {
      cdkBuilder.endpoint(endpoint.let(IInterfaceVpcEndpoint::unwrap))
    }

    /**
     * Characters which should not appear in the generated password.
     *
     * Default: - no additional characters are explicitly excluded
     *
     * @param excludeCharacters Characters which should not appear in the generated password. 
     */
    override fun excludeCharacters(excludeCharacters: String) {
      cdkBuilder.excludeCharacters(excludeCharacters)
    }

    /**
     * The master secret for a multi user rotation scheme.
     *
     * Default: - single user rotation scheme
     *
     * @param masterSecret The master secret for a multi user rotation scheme. 
     */
    override fun masterSecret(masterSecret: ISecret) {
      cdkBuilder.masterSecret(masterSecret.let(ISecret::unwrap))
    }

    /**
     * Specifies whether to rotate the secret immediately or wait until the next scheduled rotation
     * window.
     *
     * Default: true
     *
     * @param rotateImmediatelyOnUpdate Specifies whether to rotate the secret immediately or wait
     * until the next scheduled rotation window. 
     */
    override fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean) {
      cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate)
    }

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
     * @param secret The secret to rotate. It must be a JSON string with the following format:. 
     */
    override fun secret(secret: ISecret) {
      cdkBuilder.secret(secret.let(ISecret::unwrap))
    }

    /**
     * The security group for the Lambda rotation function.
     *
     * Default: - a new security group is created
     *
     * @param securityGroup The security group for the Lambda rotation function. 
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    /**
     * The target service or database.
     *
     * @param target The target service or database. 
     */
    override fun target(target: IConnectable) {
      cdkBuilder.target(target.let(IConnectable::unwrap))
    }

    /**
     * The VPC where the Lambda rotation function will run.
     *
     * @param vpc The VPC where the Lambda rotation function will run. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * The type of subnets in the VPC where the Lambda rotation function will run.
     *
     * Default: - the Vpc default strategy if not specified.
     *
     * @param vpcSubnets The type of subnets in the VPC where the Lambda rotation function will run.
     * 
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * The type of subnets in the VPC where the Lambda rotation function will run.
     *
     * Default: - the Vpc default strategy if not specified.
     *
     * @param vpcSubnets The type of subnets in the VPC where the Lambda rotation function will run.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("136a5ed61cdfb22b58b54793b40c1245b6ae240baad9a465918841ea64c85530")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.secretsmanager.SecretRotation =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): SecretRotation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return SecretRotation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.SecretRotation):
        SecretRotation = SecretRotation(cdkObject)

    internal fun unwrap(wrapped: SecretRotation):
        software.amazon.awscdk.services.secretsmanager.SecretRotation = wrapped.cdkObject
  }
}
