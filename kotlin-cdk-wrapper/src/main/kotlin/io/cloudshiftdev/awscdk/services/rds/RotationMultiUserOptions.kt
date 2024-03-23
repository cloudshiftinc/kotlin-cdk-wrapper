@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IInterfaceVpcEndpoint
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Options to add the multi user rotation.
 *
 * Example:
 *
 * ```
 * DatabaseInstance instance;
 * DatabaseSecret myImportedSecret;
 * instance.addRotationMultiUser("MyUser", RotationMultiUserOptions.builder()
 * .secret(myImportedSecret)
 * .build());
 * ```
 */
public interface RotationMultiUserOptions : CommonRotationUserOptions {
  /**
   * The secret to rotate.
   *
   * It must be a JSON string with the following format:
   *
   * ```
   * {
   * "engine": &lt;required: database engine&gt;,
   * "host": &lt;required: instance host name&gt;,
   * "username": &lt;required: username&gt;,
   * "password": &lt;required: password&gt;,
   * "dbname": &lt;optional: database name&gt;,
   * "port": &lt;optional: if not specified, default port will be used&gt;,
   * "masterarn": &lt;required: the arn of the master secret which will be used to create
   * users/change passwords&gt;
   * }
   * ```
   */
  public fun secret(): ISecret

  /**
   * A builder for [RotationMultiUserOptions]
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param excludeCharacters Specifies characters to not include in generated passwords.
     */
    public fun excludeCharacters(excludeCharacters: String)

    /**
     * @param rotateImmediatelyOnUpdate Specifies whether to rotate the secret immediately or wait
     * until the next scheduled rotation window.
     */
    public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean)

    /**
     * @param secret The secret to rotate. 
     * It must be a JSON string with the following format:
     *
     * ```
     * {
     * "engine": &lt;required: database engine&gt;,
     * "host": &lt;required: instance host name&gt;,
     * "username": &lt;required: username&gt;,
     * "password": &lt;required: password&gt;,
     * "dbname": &lt;optional: database name&gt;,
     * "port": &lt;optional: if not specified, default port will be used&gt;,
     * "masterarn": &lt;required: the arn of the master secret which will be used to create
     * users/change passwords&gt;
     * }
     * ```
     */
    public fun secret(secret: ISecret)

    /**
     * @param securityGroup The security group for the Lambda rotation function.
     */
    public fun securityGroup(securityGroup: ISecurityGroup)

    /**
     * @param vpcSubnets Where to place the rotation Lambda function.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * @param vpcSubnets Where to place the rotation Lambda function.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4b4b53317b135737574f28ede66ad0d97ae4f86b53ac516bd5a0a73afda88324")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.RotationMultiUserOptions.Builder =
        software.amazon.awscdk.services.rds.RotationMultiUserOptions.builder()

    /**
     * @param automaticallyAfter Specifies the number of days after the previous rotation before
     * Secrets Manager triggers the next automatic rotation.
     */
    override fun automaticallyAfter(automaticallyAfter: Duration) {
      cdkBuilder.automaticallyAfter(automaticallyAfter.let(Duration::unwrap))
    }

    /**
     * @param endpoint The VPC interface endpoint to use for the Secrets Manager API.
     * If you enable private DNS hostnames for your VPC private endpoint (the default), you don't
     * need to specify an endpoint. The standard Secrets Manager DNS hostname the Secrets Manager
     * CLI and SDKs use by default (https://secretsmanager.<region>.amazonaws.com) automatically
     * resolves to your VPC endpoint.
     */
    override fun endpoint(endpoint: IInterfaceVpcEndpoint) {
      cdkBuilder.endpoint(endpoint.let(IInterfaceVpcEndpoint::unwrap))
    }

    /**
     * @param excludeCharacters Specifies characters to not include in generated passwords.
     */
    override fun excludeCharacters(excludeCharacters: String) {
      cdkBuilder.excludeCharacters(excludeCharacters)
    }

    /**
     * @param rotateImmediatelyOnUpdate Specifies whether to rotate the secret immediately or wait
     * until the next scheduled rotation window.
     */
    override fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean) {
      cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate)
    }

    /**
     * @param secret The secret to rotate. 
     * It must be a JSON string with the following format:
     *
     * ```
     * {
     * "engine": &lt;required: database engine&gt;,
     * "host": &lt;required: instance host name&gt;,
     * "username": &lt;required: username&gt;,
     * "password": &lt;required: password&gt;,
     * "dbname": &lt;optional: database name&gt;,
     * "port": &lt;optional: if not specified, default port will be used&gt;,
     * "masterarn": &lt;required: the arn of the master secret which will be used to create
     * users/change passwords&gt;
     * }
     * ```
     */
    override fun secret(secret: ISecret) {
      cdkBuilder.secret(secret.let(ISecret::unwrap))
    }

    /**
     * @param securityGroup The security group for the Lambda rotation function.
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    /**
     * @param vpcSubnets Where to place the rotation Lambda function.
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * @param vpcSubnets Where to place the rotation Lambda function.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4b4b53317b135737574f28ede66ad0d97ae4f86b53ac516bd5a0a73afda88324")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.rds.RotationMultiUserOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.RotationMultiUserOptions,
  ) : CdkObject(cdkObject), RotationMultiUserOptions {
    /**
     * Specifies the number of days after the previous rotation before Secrets Manager triggers the
     * next automatic rotation.
     *
     * Default: - 30 days
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
     * Specifies characters to not include in generated passwords.
     *
     * Default: " %+~`#$&*()|[]{}:;<>?!'/@\"\\"
     */
    override fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

    /**
     * Specifies whether to rotate the secret immediately or wait until the next scheduled rotation
     * window.
     *
     * Default: true
     */
    override fun rotateImmediatelyOnUpdate(): Boolean? = unwrap(this).getRotateImmediatelyOnUpdate()

    /**
     * The secret to rotate.
     *
     * It must be a JSON string with the following format:
     *
     * ```
     * {
     * "engine": &lt;required: database engine&gt;,
     * "host": &lt;required: instance host name&gt;,
     * "username": &lt;required: username&gt;,
     * "password": &lt;required: password&gt;,
     * "dbname": &lt;optional: database name&gt;,
     * "port": &lt;optional: if not specified, default port will be used&gt;,
     * "masterarn": &lt;required: the arn of the master secret which will be used to create
     * users/change passwords&gt;
     * }
     * ```
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
     * Where to place the rotation Lambda function.
     *
     * Default: - same placement as instance or cluster
     */
    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RotationMultiUserOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.RotationMultiUserOptions):
        RotationMultiUserOptions = CdkObjectWrappers.wrap(cdkObject) as? RotationMultiUserOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RotationMultiUserOptions):
        software.amazon.awscdk.services.rds.RotationMultiUserOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.RotationMultiUserOptions
  }
}
