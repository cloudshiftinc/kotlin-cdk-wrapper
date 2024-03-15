@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnSoftwarePackage`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnSoftwarePackageProps cfnSoftwarePackageProps = CfnSoftwarePackageProps.builder()
 * .description("description")
 * .packageName("packageName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackage.html)
 */
public interface CfnSoftwarePackageProps {
  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackage.html#cfn-iot-softwarepackage-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackage.html#cfn-iot-softwarepackage-packagename)
   */
  public fun packageName(): String? = unwrap(this).getPackageName()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackage.html#cfn-iot-softwarepackage-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnSoftwarePackageProps]
   */
  @CdkDslMarker
  public interface Builder {
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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnSoftwarePackageProps.Builder =
        software.amazon.awscdk.services.iot.CfnSoftwarePackageProps.builder()

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
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iot.CfnSoftwarePackageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnSoftwarePackageProps,
  ) : CdkObject(cdkObject), CfnSoftwarePackageProps {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackage.html#cfn-iot-softwarepackage-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackage.html#cfn-iot-softwarepackage-packagename)
     */
    override fun packageName(): String? = unwrap(this).getPackageName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackage.html#cfn-iot-softwarepackage-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSoftwarePackageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSoftwarePackageProps):
        CfnSoftwarePackageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSoftwarePackageProps):
        software.amazon.awscdk.services.iot.CfnSoftwarePackageProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnSoftwarePackageProps
  }
}
