package io.cloudshiftdev.awscdk.services.redshift

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnEndpointAccessProps {
  /**
   * The cluster identifier of the cluster associated with the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointaccess.html#cfn-redshift-endpointaccess-clusteridentifier)
   */
  public fun clusterIdentifier(): String

  /**
   * The name of the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointaccess.html#cfn-redshift-endpointaccess-endpointname)
   */
  public fun endpointName(): String

  /**
   * The AWS account ID of the owner of the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointaccess.html#cfn-redshift-endpointaccess-resourceowner)
   */
  public fun resourceOwner(): String? = unwrap(this).getResourceOwner()

  /**
   * The subnet group name where Amazon Redshift chooses to deploy the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointaccess.html#cfn-redshift-endpointaccess-subnetgroupname)
   */
  public fun subnetGroupName(): String

  /**
   * The security group that defines the ports, protocols, and sources for inbound traffic that you
   * are authorizing into your endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointaccess.html#cfn-redshift-endpointaccess-vpcsecuritygroupids)
   */
  public fun vpcSecurityGroupIds(): List<String>

  /**
   * A builder for [CfnEndpointAccessProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clusterIdentifier The cluster identifier of the cluster associated with the endpoint. 
     */
    public fun clusterIdentifier(clusterIdentifier: String)

    /**
     * @param endpointName The name of the endpoint. 
     */
    public fun endpointName(endpointName: String)

    /**
     * @param resourceOwner The AWS account ID of the owner of the cluster.
     */
    public fun resourceOwner(resourceOwner: String)

    /**
     * @param subnetGroupName The subnet group name where Amazon Redshift chooses to deploy the
     * endpoint. 
     */
    public fun subnetGroupName(subnetGroupName: String)

    /**
     * @param vpcSecurityGroupIds The security group that defines the ports, protocols, and sources
     * for inbound traffic that you are authorizing into your endpoint. 
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    /**
     * @param vpcSecurityGroupIds The security group that defines the ports, protocols, and sources
     * for inbound traffic that you are authorizing into your endpoint. 
     */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.redshift.CfnEndpointAccessProps.Builder
        = software.amazon.awscdk.services.redshift.CfnEndpointAccessProps.builder()

    /**
     * @param clusterIdentifier The cluster identifier of the cluster associated with the endpoint. 
     */
    override fun clusterIdentifier(clusterIdentifier: String) {
      cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    /**
     * @param endpointName The name of the endpoint. 
     */
    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    /**
     * @param resourceOwner The AWS account ID of the owner of the cluster.
     */
    override fun resourceOwner(resourceOwner: String) {
      cdkBuilder.resourceOwner(resourceOwner)
    }

    /**
     * @param subnetGroupName The subnet group name where Amazon Redshift chooses to deploy the
     * endpoint. 
     */
    override fun subnetGroupName(subnetGroupName: String) {
      cdkBuilder.subnetGroupName(subnetGroupName)
    }

    /**
     * @param vpcSecurityGroupIds The security group that defines the ports, protocols, and sources
     * for inbound traffic that you are authorizing into your endpoint. 
     */
    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    /**
     * @param vpcSecurityGroupIds The security group that defines the ports, protocols, and sources
     * for inbound traffic that you are authorizing into your endpoint. 
     */
    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    public fun build(): software.amazon.awscdk.services.redshift.CfnEndpointAccessProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.redshift.CfnEndpointAccessProps,
  ) : CdkObject(cdkObject), CfnEndpointAccessProps {
    /**
     * The cluster identifier of the cluster associated with the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointaccess.html#cfn-redshift-endpointaccess-clusteridentifier)
     */
    override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()

    /**
     * The name of the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointaccess.html#cfn-redshift-endpointaccess-endpointname)
     */
    override fun endpointName(): String = unwrap(this).getEndpointName()

    /**
     * The AWS account ID of the owner of the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointaccess.html#cfn-redshift-endpointaccess-resourceowner)
     */
    override fun resourceOwner(): String? = unwrap(this).getResourceOwner()

    /**
     * The subnet group name where Amazon Redshift chooses to deploy the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointaccess.html#cfn-redshift-endpointaccess-subnetgroupname)
     */
    override fun subnetGroupName(): String = unwrap(this).getSubnetGroupName()

    /**
     * The security group that defines the ports, protocols, and sources for inbound traffic that
     * you are authorizing into your endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-endpointaccess.html#cfn-redshift-endpointaccess-vpcsecuritygroupids)
     */
    override fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEndpointAccessProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnEndpointAccessProps):
        CfnEndpointAccessProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEndpointAccessProps):
        software.amazon.awscdk.services.redshift.CfnEndpointAccessProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.redshift.CfnEndpointAccessProps
  }
}
