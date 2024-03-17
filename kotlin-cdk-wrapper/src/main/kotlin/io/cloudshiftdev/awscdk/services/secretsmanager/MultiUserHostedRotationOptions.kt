@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Multi user hosted rotation options.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.secretsmanager.*;
 * Secret secret;
 * SecurityGroup securityGroup;
 * Subnet subnet;
 * SubnetFilter subnetFilter;
 * Vpc vpc;
 * MultiUserHostedRotationOptions multiUserHostedRotationOptions =
 * MultiUserHostedRotationOptions.builder()
 * .masterSecret(secret)
 * // the properties below are optional
 * .excludeCharacters("excludeCharacters")
 * .functionName("functionName")
 * .securityGroups(List.of(securityGroup))
 * .vpc(vpc)
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
public interface MultiUserHostedRotationOptions : SingleUserHostedRotationOptions {
  /**
   * The master secret for a multi user rotation scheme.
   */
  public fun masterSecret(): ISecret

  /**
   * A builder for [MultiUserHostedRotationOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param excludeCharacters A string of the characters that you don't want in the password.
     */
    public fun excludeCharacters(excludeCharacters: String)

    /**
     * @param functionName A name for the Lambda created to rotate the secret.
     */
    public fun functionName(functionName: String)

    /**
     * @param masterSecret The master secret for a multi user rotation scheme. 
     */
    public fun masterSecret(masterSecret: ISecret)

    /**
     * @param securityGroups A list of security groups for the Lambda created to rotate the secret.
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups A list of security groups for the Lambda created to rotate the secret.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

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
    @JvmName("e1ae1c621d04a797ccbfc70901feca6527ba9979bd33b8d8bb20582c0a3a3afa")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.MultiUserHostedRotationOptions.Builder =
        software.amazon.awscdk.services.secretsmanager.MultiUserHostedRotationOptions.builder()

    /**
     * @param excludeCharacters A string of the characters that you don't want in the password.
     */
    override fun excludeCharacters(excludeCharacters: String) {
      cdkBuilder.excludeCharacters(excludeCharacters)
    }

    /**
     * @param functionName A name for the Lambda created to rotate the secret.
     */
    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    /**
     * @param masterSecret The master secret for a multi user rotation scheme. 
     */
    override fun masterSecret(masterSecret: ISecret) {
      cdkBuilder.masterSecret(masterSecret.let(ISecret::unwrap))
    }

    /**
     * @param securityGroups A list of security groups for the Lambda created to rotate the secret.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * @param securityGroups A list of security groups for the Lambda created to rotate the secret.
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param vpc The VPC where the Lambda rotation function will run.
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * @param vpcSubnets The type of subnets in the VPC where the Lambda rotation function will run.
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * @param vpcSubnets The type of subnets in the VPC where the Lambda rotation function will run.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1ae1c621d04a797ccbfc70901feca6527ba9979bd33b8d8bb20582c0a3a3afa")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build():
        software.amazon.awscdk.services.secretsmanager.MultiUserHostedRotationOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.secretsmanager.MultiUserHostedRotationOptions,
  ) : CdkObject(cdkObject), MultiUserHostedRotationOptions {
    /**
     * A string of the characters that you don't want in the password.
     *
     * Default: the same exclude characters as the ones used for the
     * secret or " %+~`#$&*()|[]{}:;<>?!'/@\"\\"
     */
    override fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

    /**
     * A name for the Lambda created to rotate the secret.
     *
     * Default: - a CloudFormation generated name
     */
    override fun functionName(): String? = unwrap(this).getFunctionName()

    /**
     * The master secret for a multi user rotation scheme.
     */
    override fun masterSecret(): ISecret = unwrap(this).getMasterSecret().let(ISecret::wrap)

    /**
     * A list of security groups for the Lambda created to rotate the secret.
     *
     * Default: - a new security group is created
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    /**
     * The VPC where the Lambda rotation function will run.
     *
     * Default: - the Lambda is not deployed in a VPC
     */
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

    /**
     * The type of subnets in the VPC where the Lambda rotation function will run.
     *
     * Default: - the Vpc default strategy if not specified.
     */
    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MultiUserHostedRotationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.MultiUserHostedRotationOptions):
        MultiUserHostedRotationOptions = CdkObjectWrappers.wrap(cdkObject) as?
        MultiUserHostedRotationOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: MultiUserHostedRotationOptions):
        software.amazon.awscdk.services.secretsmanager.MultiUserHostedRotationOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.secretsmanager.MultiUserHostedRotationOptions
  }
}
