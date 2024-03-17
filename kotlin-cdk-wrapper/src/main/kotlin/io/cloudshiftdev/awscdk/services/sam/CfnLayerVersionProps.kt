@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sam

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnLayerVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sam.*;
 * CfnLayerVersionProps cfnLayerVersionProps = CfnLayerVersionProps.builder()
 * .compatibleRuntimes(List.of("compatibleRuntimes"))
 * .contentUri("contentUri")
 * .description("description")
 * .layerName("layerName")
 * .licenseInfo("licenseInfo")
 * .retentionPolicy("retentionPolicy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html)
 */
public interface CfnLayerVersionProps {
  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-compatibleruntimes)
   */
  public fun compatibleRuntimes(): List<String> = unwrap(this).getCompatibleRuntimes() ?:
      emptyList()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-contenturi)
   */
  public fun contentUri(): Any? = unwrap(this).getContentUri()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-layername)
   */
  public fun layerName(): String? = unwrap(this).getLayerName()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-licenseinfo)
   */
  public fun licenseInfo(): String? = unwrap(this).getLicenseInfo()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-retentionpolicy)
   */
  public fun retentionPolicy(): String? = unwrap(this).getRetentionPolicy()

  /**
   * A builder for [CfnLayerVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param compatibleRuntimes the value to be set.
     */
    public fun compatibleRuntimes(compatibleRuntimes: List<String>)

    /**
     * @param compatibleRuntimes the value to be set.
     */
    public fun compatibleRuntimes(vararg compatibleRuntimes: String)

    /**
     * @param contentUri the value to be set.
     */
    public fun contentUri(contentUri: String)

    /**
     * @param contentUri the value to be set.
     */
    public fun contentUri(contentUri: IResolvable)

    /**
     * @param contentUri the value to be set.
     */
    public fun contentUri(contentUri: CfnLayerVersion.S3LocationProperty)

    /**
     * @param contentUri the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f3ccc33822506a6451eb647d9e3f1ac27af90dbbb761f4a6e60b7827f3bb806")
    public fun contentUri(contentUri: CfnLayerVersion.S3LocationProperty.Builder.() -> Unit)

    /**
     * @param description the value to be set.
     */
    public fun description(description: String)

    /**
     * @param layerName the value to be set.
     */
    public fun layerName(layerName: String)

    /**
     * @param licenseInfo the value to be set.
     */
    public fun licenseInfo(licenseInfo: String)

    /**
     * @param retentionPolicy the value to be set.
     */
    public fun retentionPolicy(retentionPolicy: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sam.CfnLayerVersionProps.Builder =
        software.amazon.awscdk.services.sam.CfnLayerVersionProps.builder()

    /**
     * @param compatibleRuntimes the value to be set.
     */
    override fun compatibleRuntimes(compatibleRuntimes: List<String>) {
      cdkBuilder.compatibleRuntimes(compatibleRuntimes)
    }

    /**
     * @param compatibleRuntimes the value to be set.
     */
    override fun compatibleRuntimes(vararg compatibleRuntimes: String): Unit =
        compatibleRuntimes(compatibleRuntimes.toList())

    /**
     * @param contentUri the value to be set.
     */
    override fun contentUri(contentUri: String) {
      cdkBuilder.contentUri(contentUri)
    }

    /**
     * @param contentUri the value to be set.
     */
    override fun contentUri(contentUri: IResolvable) {
      cdkBuilder.contentUri(contentUri.let(IResolvable::unwrap))
    }

    /**
     * @param contentUri the value to be set.
     */
    override fun contentUri(contentUri: CfnLayerVersion.S3LocationProperty) {
      cdkBuilder.contentUri(contentUri.let(CfnLayerVersion.S3LocationProperty::unwrap))
    }

    /**
     * @param contentUri the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f3ccc33822506a6451eb647d9e3f1ac27af90dbbb761f4a6e60b7827f3bb806")
    override fun contentUri(contentUri: CfnLayerVersion.S3LocationProperty.Builder.() -> Unit): Unit
        = contentUri(CfnLayerVersion.S3LocationProperty(contentUri))

    /**
     * @param description the value to be set.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param layerName the value to be set.
     */
    override fun layerName(layerName: String) {
      cdkBuilder.layerName(layerName)
    }

    /**
     * @param licenseInfo the value to be set.
     */
    override fun licenseInfo(licenseInfo: String) {
      cdkBuilder.licenseInfo(licenseInfo)
    }

    /**
     * @param retentionPolicy the value to be set.
     */
    override fun retentionPolicy(retentionPolicy: String) {
      cdkBuilder.retentionPolicy(retentionPolicy)
    }

    public fun build(): software.amazon.awscdk.services.sam.CfnLayerVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sam.CfnLayerVersionProps,
  ) : CdkObject(cdkObject), CfnLayerVersionProps {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-compatibleruntimes)
     */
    override fun compatibleRuntimes(): List<String> = unwrap(this).getCompatibleRuntimes() ?:
        emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-contenturi)
     */
    override fun contentUri(): Any? = unwrap(this).getContentUri()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-layername)
     */
    override fun layerName(): String? = unwrap(this).getLayerName()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-licenseinfo)
     */
    override fun licenseInfo(): String? = unwrap(this).getLicenseInfo()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-layerversion.html#cfn-serverless-layerversion-retentionpolicy)
     */
    override fun retentionPolicy(): String? = unwrap(this).getRetentionPolicy()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLayerVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnLayerVersionProps):
        CfnLayerVersionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnLayerVersionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLayerVersionProps):
        software.amazon.awscdk.services.sam.CfnLayerVersionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sam.CfnLayerVersionProps
  }
}
