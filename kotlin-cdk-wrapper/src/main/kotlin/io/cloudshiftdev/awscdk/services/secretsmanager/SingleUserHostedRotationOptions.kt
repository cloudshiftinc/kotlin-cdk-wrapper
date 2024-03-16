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
 * Single user hosted rotation options.
 *
 * Example:
 *
 * ```
 * IVpc myVpc;
 * Connections dbConnections;
 * Secret secret;
 * HostedRotation myHostedRotation =
 * HostedRotation.mysqlSingleUser(SingleUserHostedRotationOptions.builder().vpc(myVpc).build());
 * secret.addRotationSchedule("RotationSchedule",
 * RotationScheduleOptions.builder().hostedRotation(myHostedRotation).build());
 * dbConnections.allowDefaultPortFrom(myHostedRotation);
 * ```
 */
public interface SingleUserHostedRotationOptions {
  /**
   * A string of the characters that you don't want in the password.
   *
   * Default: the same exclude characters as the ones used for the
   * secret or " %+~`#$&*()|[]{}:;<>?!'/@\"\\"
   */
  public fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

  /**
   * A name for the Lambda created to rotate the secret.
   *
   * Default: - a CloudFormation generated name
   */
  public fun functionName(): String? = unwrap(this).getFunctionName()

  /**
   * A list of security groups for the Lambda created to rotate the secret.
   *
   * Default: - a new security group is created
   */
  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  /**
   * The VPC where the Lambda rotation function will run.
   *
   * Default: - the Lambda is not deployed in a VPC
   */
  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  /**
   * The type of subnets in the VPC where the Lambda rotation function will run.
   *
   * Default: - the Vpc default strategy if not specified.
   */
  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  /**
   * A builder for [SingleUserHostedRotationOptions]
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
    @JvmName("a8fc7793735ffad2acca3bfa30c4bf13619d228febd80f66d9d2a5c0c2b8232e")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.SingleUserHostedRotationOptions.Builder =
        software.amazon.awscdk.services.secretsmanager.SingleUserHostedRotationOptions.builder()

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
    @JvmName("a8fc7793735ffad2acca3bfa30c4bf13619d228febd80f66d9d2a5c0c2b8232e")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build():
        software.amazon.awscdk.services.secretsmanager.SingleUserHostedRotationOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.secretsmanager.SingleUserHostedRotationOptions,
  ) : CdkObject(cdkObject), SingleUserHostedRotationOptions {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): SingleUserHostedRotationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.SingleUserHostedRotationOptions):
        SingleUserHostedRotationOptions = CdkObjectWrappers.wrap(cdkObject) as
        SingleUserHostedRotationOptions

    internal fun unwrap(wrapped: SingleUserHostedRotationOptions):
        software.amazon.awscdk.services.secretsmanager.SingleUserHostedRotationOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.secretsmanager.SingleUserHostedRotationOptions
  }
}
