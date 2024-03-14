package io.cloudshiftdev.awscdk.services.mediapackage

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnPackagingConfigurationProps {
  /**
   * Parameters for CMAF packaging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-cmafpackage)
   */
  public fun cmafPackage(): Any? = unwrap(this).getCmafPackage()

  /**
   * Parameters for DASH-ISO packaging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-dashpackage)
   */
  public fun dashPackage(): Any? = unwrap(this).getDashPackage()

  /**
   * Parameters for Apple HLS packaging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-hlspackage)
   */
  public fun hlsPackage(): Any? = unwrap(this).getHlsPackage()

  /**
   * Unique identifier that you assign to the packaging configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-id)
   */
  public fun id(): String

  /**
   * Parameters for Microsoft Smooth Streaming packaging.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-msspackage)
   */
  public fun mssPackage(): Any? = unwrap(this).getMssPackage()

  /**
   * The ID of the packaging group associated with this packaging configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-packaginggroupid)
   */
  public fun packagingGroupId(): String

  /**
   * The tags to assign to the packaging configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnPackagingConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cmafPackage Parameters for CMAF packaging.
     */
    public fun cmafPackage(cmafPackage: IResolvable)

    /**
     * @param cmafPackage Parameters for CMAF packaging.
     */
    public fun cmafPackage(cmafPackage: CfnPackagingConfiguration.CmafPackageProperty)

    /**
     * @param cmafPackage Parameters for CMAF packaging.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d3e6a4589841a52e0bb9d08bd825fe085226d9e8bca21c24f3eaa6ca2072396")
    public
        fun cmafPackage(cmafPackage: CfnPackagingConfiguration.CmafPackageProperty.Builder.() -> Unit)

    /**
     * @param dashPackage Parameters for DASH-ISO packaging.
     */
    public fun dashPackage(dashPackage: IResolvable)

    /**
     * @param dashPackage Parameters for DASH-ISO packaging.
     */
    public fun dashPackage(dashPackage: CfnPackagingConfiguration.DashPackageProperty)

    /**
     * @param dashPackage Parameters for DASH-ISO packaging.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dfe14f571c4ef05986e320515d3d5657d307b6cae8cea4de1d3a9ec52d520774")
    public
        fun dashPackage(dashPackage: CfnPackagingConfiguration.DashPackageProperty.Builder.() -> Unit)

    /**
     * @param hlsPackage Parameters for Apple HLS packaging.
     */
    public fun hlsPackage(hlsPackage: IResolvable)

    /**
     * @param hlsPackage Parameters for Apple HLS packaging.
     */
    public fun hlsPackage(hlsPackage: CfnPackagingConfiguration.HlsPackageProperty)

    /**
     * @param hlsPackage Parameters for Apple HLS packaging.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("58da73184e79ed85b2fd3ab2d97831d8e40d833ab8b100dc7a1554ad4d925e6b")
    public
        fun hlsPackage(hlsPackage: CfnPackagingConfiguration.HlsPackageProperty.Builder.() -> Unit)

    /**
     * @param id Unique identifier that you assign to the packaging configuration. 
     */
    public fun id(id: String)

    /**
     * @param mssPackage Parameters for Microsoft Smooth Streaming packaging.
     */
    public fun mssPackage(mssPackage: IResolvable)

    /**
     * @param mssPackage Parameters for Microsoft Smooth Streaming packaging.
     */
    public fun mssPackage(mssPackage: CfnPackagingConfiguration.MssPackageProperty)

    /**
     * @param mssPackage Parameters for Microsoft Smooth Streaming packaging.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a03b4b861f92c46fb1ce0883d5b0593143187a8a76d22ef0e9e22cda6170f409")
    public
        fun mssPackage(mssPackage: CfnPackagingConfiguration.MssPackageProperty.Builder.() -> Unit)

    /**
     * @param packagingGroupId The ID of the packaging group associated with this packaging
     * configuration. 
     */
    public fun packagingGroupId(packagingGroupId: String)

    /**
     * @param tags The tags to assign to the packaging configuration.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to assign to the packaging configuration.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediapackage.CfnPackagingConfigurationProps.Builder =
        software.amazon.awscdk.services.mediapackage.CfnPackagingConfigurationProps.builder()

    /**
     * @param cmafPackage Parameters for CMAF packaging.
     */
    override fun cmafPackage(cmafPackage: IResolvable) {
      cdkBuilder.cmafPackage(cmafPackage.let(IResolvable::unwrap))
    }

    /**
     * @param cmafPackage Parameters for CMAF packaging.
     */
    override fun cmafPackage(cmafPackage: CfnPackagingConfiguration.CmafPackageProperty) {
      cdkBuilder.cmafPackage(cmafPackage.let(CfnPackagingConfiguration.CmafPackageProperty::unwrap))
    }

    /**
     * @param cmafPackage Parameters for CMAF packaging.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d3e6a4589841a52e0bb9d08bd825fe085226d9e8bca21c24f3eaa6ca2072396")
    override
        fun cmafPackage(cmafPackage: CfnPackagingConfiguration.CmafPackageProperty.Builder.() -> Unit):
        Unit = cmafPackage(CfnPackagingConfiguration.CmafPackageProperty(cmafPackage))

    /**
     * @param dashPackage Parameters for DASH-ISO packaging.
     */
    override fun dashPackage(dashPackage: IResolvable) {
      cdkBuilder.dashPackage(dashPackage.let(IResolvable::unwrap))
    }

    /**
     * @param dashPackage Parameters for DASH-ISO packaging.
     */
    override fun dashPackage(dashPackage: CfnPackagingConfiguration.DashPackageProperty) {
      cdkBuilder.dashPackage(dashPackage.let(CfnPackagingConfiguration.DashPackageProperty::unwrap))
    }

    /**
     * @param dashPackage Parameters for DASH-ISO packaging.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dfe14f571c4ef05986e320515d3d5657d307b6cae8cea4de1d3a9ec52d520774")
    override
        fun dashPackage(dashPackage: CfnPackagingConfiguration.DashPackageProperty.Builder.() -> Unit):
        Unit = dashPackage(CfnPackagingConfiguration.DashPackageProperty(dashPackage))

    /**
     * @param hlsPackage Parameters for Apple HLS packaging.
     */
    override fun hlsPackage(hlsPackage: IResolvable) {
      cdkBuilder.hlsPackage(hlsPackage.let(IResolvable::unwrap))
    }

    /**
     * @param hlsPackage Parameters for Apple HLS packaging.
     */
    override fun hlsPackage(hlsPackage: CfnPackagingConfiguration.HlsPackageProperty) {
      cdkBuilder.hlsPackage(hlsPackage.let(CfnPackagingConfiguration.HlsPackageProperty::unwrap))
    }

    /**
     * @param hlsPackage Parameters for Apple HLS packaging.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("58da73184e79ed85b2fd3ab2d97831d8e40d833ab8b100dc7a1554ad4d925e6b")
    override
        fun hlsPackage(hlsPackage: CfnPackagingConfiguration.HlsPackageProperty.Builder.() -> Unit):
        Unit = hlsPackage(CfnPackagingConfiguration.HlsPackageProperty(hlsPackage))

    /**
     * @param id Unique identifier that you assign to the packaging configuration. 
     */
    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    /**
     * @param mssPackage Parameters for Microsoft Smooth Streaming packaging.
     */
    override fun mssPackage(mssPackage: IResolvable) {
      cdkBuilder.mssPackage(mssPackage.let(IResolvable::unwrap))
    }

    /**
     * @param mssPackage Parameters for Microsoft Smooth Streaming packaging.
     */
    override fun mssPackage(mssPackage: CfnPackagingConfiguration.MssPackageProperty) {
      cdkBuilder.mssPackage(mssPackage.let(CfnPackagingConfiguration.MssPackageProperty::unwrap))
    }

    /**
     * @param mssPackage Parameters for Microsoft Smooth Streaming packaging.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a03b4b861f92c46fb1ce0883d5b0593143187a8a76d22ef0e9e22cda6170f409")
    override
        fun mssPackage(mssPackage: CfnPackagingConfiguration.MssPackageProperty.Builder.() -> Unit):
        Unit = mssPackage(CfnPackagingConfiguration.MssPackageProperty(mssPackage))

    /**
     * @param packagingGroupId The ID of the packaging group associated with this packaging
     * configuration. 
     */
    override fun packagingGroupId(packagingGroupId: String) {
      cdkBuilder.packagingGroupId(packagingGroupId)
    }

    /**
     * @param tags The tags to assign to the packaging configuration.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags to assign to the packaging configuration.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mediapackage.CfnPackagingConfigurationProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.mediapackage.CfnPackagingConfigurationProps,
  ) : CdkObject(cdkObject), CfnPackagingConfigurationProps {
    /**
     * Parameters for CMAF packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-cmafpackage)
     */
    override fun cmafPackage(): Any? = unwrap(this).getCmafPackage()

    /**
     * Parameters for DASH-ISO packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-dashpackage)
     */
    override fun dashPackage(): Any? = unwrap(this).getDashPackage()

    /**
     * Parameters for Apple HLS packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-hlspackage)
     */
    override fun hlsPackage(): Any? = unwrap(this).getHlsPackage()

    /**
     * Unique identifier that you assign to the packaging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-id)
     */
    override fun id(): String = unwrap(this).getId()

    /**
     * Parameters for Microsoft Smooth Streaming packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-msspackage)
     */
    override fun mssPackage(): Any? = unwrap(this).getMssPackage()

    /**
     * The ID of the packaging group associated with this packaging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-packaginggroupid)
     */
    override fun packagingGroupId(): String = unwrap(this).getPackagingGroupId()

    /**
     * The tags to assign to the packaging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPackagingConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfigurationProps):
        CfnPackagingConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPackagingConfigurationProps):
        software.amazon.awscdk.services.mediapackage.CfnPackagingConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.mediapackage.CfnPackagingConfigurationProps
  }
}
