@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pcaconnectorscep

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
 * import io.cloudshiftdev.awscdk.services.pcaconnectorscep.*;
 * CfnConnectorProps cfnConnectorProps = CfnConnectorProps.builder()
 * .certificateAuthorityArn("certificateAuthorityArn")
 * // the properties below are optional
 * .mobileDeviceManagement(MobileDeviceManagementProperty.builder()
 * .intune(IntuneConfigurationProperty.builder()
 * .azureApplicationId("azureApplicationId")
 * .domain("domain")
 * .build())
 * .build())
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorscep-connector.html)
 */
public interface CfnConnectorProps {
  /**
   * The Amazon Resource Name (ARN) of the certificate authority associated with the connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorscep-connector.html#cfn-pcaconnectorscep-connector-certificateauthorityarn)
   */
  public fun certificateAuthorityArn(): String

  /**
   * Contains settings relevant to the mobile device management system that you chose for the
   * connector.
   *
   * If you didn't configure `MobileDeviceManagement` , then the connector is for general-purpose
   * use and this object is empty.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorscep-connector.html#cfn-pcaconnectorscep-connector-mobiledevicemanagement)
   */
  public fun mobileDeviceManagement(): Any? = unwrap(this).getMobileDeviceManagement()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorscep-connector.html#cfn-pcaconnectorscep-connector-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnConnectorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param certificateAuthorityArn The Amazon Resource Name (ARN) of the certificate authority
     * associated with the connector. 
     */
    public fun certificateAuthorityArn(certificateAuthorityArn: String)

    /**
     * @param mobileDeviceManagement Contains settings relevant to the mobile device management
     * system that you chose for the connector.
     * If you didn't configure `MobileDeviceManagement` , then the connector is for general-purpose
     * use and this object is empty.
     */
    public fun mobileDeviceManagement(mobileDeviceManagement: IResolvable)

    /**
     * @param mobileDeviceManagement Contains settings relevant to the mobile device management
     * system that you chose for the connector.
     * If you didn't configure `MobileDeviceManagement` , then the connector is for general-purpose
     * use and this object is empty.
     */
    public
        fun mobileDeviceManagement(mobileDeviceManagement: CfnConnector.MobileDeviceManagementProperty)

    /**
     * @param mobileDeviceManagement Contains settings relevant to the mobile device management
     * system that you chose for the connector.
     * If you didn't configure `MobileDeviceManagement` , then the connector is for general-purpose
     * use and this object is empty.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27815e859525a39fd67e9d7650fa2c4efac74fefda823ba2e9c30a15d355bdb5")
    public
        fun mobileDeviceManagement(mobileDeviceManagement: CfnConnector.MobileDeviceManagementProperty.Builder.() -> Unit)

    /**
     * @param tags the value to be set.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.pcaconnectorscep.CfnConnectorProps.Builder =
        software.amazon.awscdk.services.pcaconnectorscep.CfnConnectorProps.builder()

    /**
     * @param certificateAuthorityArn The Amazon Resource Name (ARN) of the certificate authority
     * associated with the connector. 
     */
    override fun certificateAuthorityArn(certificateAuthorityArn: String) {
      cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

    /**
     * @param mobileDeviceManagement Contains settings relevant to the mobile device management
     * system that you chose for the connector.
     * If you didn't configure `MobileDeviceManagement` , then the connector is for general-purpose
     * use and this object is empty.
     */
    override fun mobileDeviceManagement(mobileDeviceManagement: IResolvable) {
      cdkBuilder.mobileDeviceManagement(mobileDeviceManagement.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param mobileDeviceManagement Contains settings relevant to the mobile device management
     * system that you chose for the connector.
     * If you didn't configure `MobileDeviceManagement` , then the connector is for general-purpose
     * use and this object is empty.
     */
    override
        fun mobileDeviceManagement(mobileDeviceManagement: CfnConnector.MobileDeviceManagementProperty) {
      cdkBuilder.mobileDeviceManagement(mobileDeviceManagement.let(CfnConnector.MobileDeviceManagementProperty.Companion::unwrap))
    }

    /**
     * @param mobileDeviceManagement Contains settings relevant to the mobile device management
     * system that you chose for the connector.
     * If you didn't configure `MobileDeviceManagement` , then the connector is for general-purpose
     * use and this object is empty.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("27815e859525a39fd67e9d7650fa2c4efac74fefda823ba2e9c30a15d355bdb5")
    override
        fun mobileDeviceManagement(mobileDeviceManagement: CfnConnector.MobileDeviceManagementProperty.Builder.() -> Unit):
        Unit =
        mobileDeviceManagement(CfnConnector.MobileDeviceManagementProperty(mobileDeviceManagement))

    /**
     * @param tags the value to be set.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.pcaconnectorscep.CfnConnectorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.pcaconnectorscep.CfnConnectorProps,
  ) : CdkObject(cdkObject),
      CfnConnectorProps {
    /**
     * The Amazon Resource Name (ARN) of the certificate authority associated with the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorscep-connector.html#cfn-pcaconnectorscep-connector-certificateauthorityarn)
     */
    override fun certificateAuthorityArn(): String = unwrap(this).getCertificateAuthorityArn()

    /**
     * Contains settings relevant to the mobile device management system that you chose for the
     * connector.
     *
     * If you didn't configure `MobileDeviceManagement` , then the connector is for general-purpose
     * use and this object is empty.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorscep-connector.html#cfn-pcaconnectorscep-connector-mobiledevicemanagement)
     */
    override fun mobileDeviceManagement(): Any? = unwrap(this).getMobileDeviceManagement()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorscep-connector.html#cfn-pcaconnectorscep-connector-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorscep.CfnConnectorProps):
        CfnConnectorProps = CdkObjectWrappers.wrap(cdkObject) as? CfnConnectorProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConnectorProps):
        software.amazon.awscdk.services.pcaconnectorscep.CfnConnectorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pcaconnectorscep.CfnConnectorProps
  }
}
