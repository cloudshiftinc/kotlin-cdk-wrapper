@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for defining a `CfnSoftwarePackageVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnSoftwarePackageVersionProps cfnSoftwarePackageVersionProps =
 * CfnSoftwarePackageVersionProps.builder()
 * .packageName("packageName")
 * // the properties below are optional
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .versionName("versionName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html)
 */
public interface CfnSoftwarePackageVersionProps {
  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-attributes)
   */
  public fun attributes(): Any? = unwrap(this).getAttributes()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-packagename)
   */
  public fun packageName(): String

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-versionname)
   */
  public fun versionName(): String? = unwrap(this).getVersionName()

  /**
   * A builder for [CfnSoftwarePackageVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param attributes the value to be set.
     */
    public fun attributes(attributes: IResolvable)

    /**
     * @param attributes the value to be set.
     */
    public fun attributes(attributes: Map<String, String>)

    /**
     * @param description the value to be set.
     */
    public fun description(description: String)

    /**
     * @param packageName the value to be set. 
     */
    public fun packageName(packageName: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param versionName the value to be set.
     */
    public fun versionName(versionName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iot.CfnSoftwarePackageVersionProps.Builder =
        software.amazon.awscdk.services.iot.CfnSoftwarePackageVersionProps.builder()

    /**
     * @param attributes the value to be set.
     */
    override fun attributes(attributes: IResolvable) {
      cdkBuilder.attributes(attributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param attributes the value to be set.
     */
    override fun attributes(attributes: Map<String, String>) {
      cdkBuilder.attributes(attributes)
    }

    /**
     * @param description the value to be set.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param packageName the value to be set. 
     */
    override fun packageName(packageName: String) {
      cdkBuilder.packageName(packageName)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param versionName the value to be set.
     */
    override fun versionName(versionName: String) {
      cdkBuilder.versionName(versionName)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnSoftwarePackageVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iot.CfnSoftwarePackageVersionProps,
  ) : CdkObject(cdkObject),
      CfnSoftwarePackageVersionProps {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-attributes)
     */
    override fun attributes(): Any? = unwrap(this).getAttributes()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-packagename)
     */
    override fun packageName(): String = unwrap(this).getPackageName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-versionname)
     */
    override fun versionName(): String? = unwrap(this).getVersionName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSoftwarePackageVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSoftwarePackageVersionProps):
        CfnSoftwarePackageVersionProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnSoftwarePackageVersionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSoftwarePackageVersionProps):
        software.amazon.awscdk.services.iot.CfnSoftwarePackageVersionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnSoftwarePackageVersionProps
  }
}
