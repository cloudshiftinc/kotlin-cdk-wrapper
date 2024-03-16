@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pcaconnectorad

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnConnector`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pcaconnectorad.*;
 * CfnConnectorProps cfnConnectorProps = CfnConnectorProps.builder()
 * .certificateAuthorityArn("certificateAuthorityArn")
 * .directoryId("directoryId")
 * .vpcInformation(VpcInformationProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .build())
 * // the properties below are optional
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html)
 */
public interface CfnConnectorProps {
  /**
   * The Amazon Resource Name (ARN) of the certificate authority being used.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html#cfn-pcaconnectorad-connector-certificateauthorityarn)
   */
  public fun certificateAuthorityArn(): String

  /**
   * The identifier of the Active Directory.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html#cfn-pcaconnectorad-connector-directoryid)
   */
  public fun directoryId(): String

  /**
   * Metadata assigned to a connector consisting of a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html#cfn-pcaconnectorad-connector-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * Information of the VPC and security group(s) used with the connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html#cfn-pcaconnectorad-connector-vpcinformation)
   */
  public fun vpcInformation(): Any

  /**
   * A builder for [CfnConnectorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param certificateAuthorityArn The Amazon Resource Name (ARN) of the certificate authority
     * being used. 
     */
    public fun certificateAuthorityArn(certificateAuthorityArn: String)

    /**
     * @param directoryId The identifier of the Active Directory. 
     */
    public fun directoryId(directoryId: String)

    /**
     * @param tags Metadata assigned to a connector consisting of a key-value pair.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param vpcInformation Information of the VPC and security group(s) used with the connector. 
     */
    public fun vpcInformation(vpcInformation: IResolvable)

    /**
     * @param vpcInformation Information of the VPC and security group(s) used with the connector. 
     */
    public fun vpcInformation(vpcInformation: CfnConnector.VpcInformationProperty)

    /**
     * @param vpcInformation Information of the VPC and security group(s) used with the connector. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b72708b75267a7a0a997759e0947d4727eb2c94c952424cf35e01c8ca2a3a77d")
    public
        fun vpcInformation(vpcInformation: CfnConnector.VpcInformationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pcaconnectorad.CfnConnectorProps.Builder
        = software.amazon.awscdk.services.pcaconnectorad.CfnConnectorProps.builder()

    /**
     * @param certificateAuthorityArn The Amazon Resource Name (ARN) of the certificate authority
     * being used. 
     */
    override fun certificateAuthorityArn(certificateAuthorityArn: String) {
      cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

    /**
     * @param directoryId The identifier of the Active Directory. 
     */
    override fun directoryId(directoryId: String) {
      cdkBuilder.directoryId(directoryId)
    }

    /**
     * @param tags Metadata assigned to a connector consisting of a key-value pair.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param vpcInformation Information of the VPC and security group(s) used with the connector. 
     */
    override fun vpcInformation(vpcInformation: IResolvable) {
      cdkBuilder.vpcInformation(vpcInformation.let(IResolvable::unwrap))
    }

    /**
     * @param vpcInformation Information of the VPC and security group(s) used with the connector. 
     */
    override fun vpcInformation(vpcInformation: CfnConnector.VpcInformationProperty) {
      cdkBuilder.vpcInformation(vpcInformation.let(CfnConnector.VpcInformationProperty::unwrap))
    }

    /**
     * @param vpcInformation Information of the VPC and security group(s) used with the connector. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b72708b75267a7a0a997759e0947d4727eb2c94c952424cf35e01c8ca2a3a77d")
    override
        fun vpcInformation(vpcInformation: CfnConnector.VpcInformationProperty.Builder.() -> Unit):
        Unit = vpcInformation(CfnConnector.VpcInformationProperty(vpcInformation))

    public fun build(): software.amazon.awscdk.services.pcaconnectorad.CfnConnectorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnConnectorProps,
  ) : CdkObject(cdkObject), CfnConnectorProps {
    /**
     * The Amazon Resource Name (ARN) of the certificate authority being used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html#cfn-pcaconnectorad-connector-certificateauthorityarn)
     */
    override fun certificateAuthorityArn(): String = unwrap(this).getCertificateAuthorityArn()

    /**
     * The identifier of the Active Directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html#cfn-pcaconnectorad-connector-directoryid)
     */
    override fun directoryId(): String = unwrap(this).getDirectoryId()

    /**
     * Metadata assigned to a connector consisting of a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html#cfn-pcaconnectorad-connector-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * Information of the VPC and security group(s) used with the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorad-connector.html#cfn-pcaconnectorad-connector-vpcinformation)
     */
    override fun vpcInformation(): Any = unwrap(this).getVpcInformation()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnConnectorProps):
        CfnConnectorProps = CdkObjectWrappers.wrap(cdkObject) as CfnConnectorProps

    internal fun unwrap(wrapped: CfnConnectorProps):
        software.amazon.awscdk.services.pcaconnectorad.CfnConnectorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pcaconnectorad.CfnConnectorProps
  }
}
