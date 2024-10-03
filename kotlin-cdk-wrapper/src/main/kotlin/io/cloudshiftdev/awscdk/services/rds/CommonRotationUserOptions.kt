@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IInterfaceVpcEndpoint
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties common to single-user and multi-user rotation options.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * InterfaceVpcEndpoint interfaceVpcEndpoint;
 * SecurityGroup securityGroup;
 * Subnet subnet;
 * SubnetFilter subnetFilter;
 * CommonRotationUserOptions commonRotationUserOptions = CommonRotationUserOptions.builder()
 * .automaticallyAfter(Duration.minutes(30))
 * .endpoint(interfaceVpcEndpoint)
 * .excludeCharacters("excludeCharacters")
 * .rotateImmediatelyOnUpdate(false)
 * .securityGroup(securityGroup)
 * .vpcSubnets(SubnetSelection.builder()
 * .availabilityZones(List.of("availabilityZones"))
 * .onePerAz(false)
 * .subnetFilters(List.of(subnetFilter))
 * .subnetGroupName("subnetGroupName")
 * .subnets(List.of(subnet))
 * .subnetType(SubnetType.PRIVATE_ISOLATED)
 * .build())
 * .build();
 * ```
 */
public interface CommonRotationUserOptions {
  /**
   * Specifies the number of days after the previous rotation before Secrets Manager triggers the
   * next automatic rotation.
   *
   * Default: - 30 days
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
   * Specifies characters to not include in generated passwords.
   *
   * Default: " %+~`#$&*()|[]{}:;<>?!'/@\"\\"
   */
  public fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

  /**
   * Specifies whether to rotate the secret immediately or wait until the next scheduled rotation
   * window.
   *
   * Default: true
   */
  public fun rotateImmediatelyOnUpdate(): Boolean? = unwrap(this).getRotateImmediatelyOnUpdate()

  /**
   * The security group for the Lambda rotation function.
   *
   * Default: - a new security group is created
   */
  public fun securityGroup(): ISecurityGroup? =
      unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

  /**
   * Where to place the rotation Lambda function.
   *
   * Default: - same placement as instance or cluster
   */
  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  /**
   * A builder for [CommonRotationUserOptions]
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
    @JvmName("7b200c3d785e2d1316710b34f4ad38b694f599a3aadc2577bfeb61652e2e267b")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CommonRotationUserOptions.Builder =
        software.amazon.awscdk.services.rds.CommonRotationUserOptions.builder()

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
     * @param securityGroup The security group for the Lambda rotation function.
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup.Companion::unwrap))
    }

    /**
     * @param vpcSubnets Where to place the rotation Lambda function.
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * @param vpcSubnets Where to place the rotation Lambda function.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b200c3d785e2d1316710b34f4ad38b694f599a3aadc2577bfeb61652e2e267b")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.rds.CommonRotationUserOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.CommonRotationUserOptions,
  ) : CdkObject(cdkObject),
      CommonRotationUserOptions {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): CommonRotationUserOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CommonRotationUserOptions):
        CommonRotationUserOptions = CdkObjectWrappers.wrap(cdkObject) as? CommonRotationUserOptions
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CommonRotationUserOptions):
        software.amazon.awscdk.services.rds.CommonRotationUserOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.CommonRotationUserOptions
  }
}
