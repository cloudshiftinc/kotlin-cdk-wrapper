@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bcmdataexports

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnExport`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bcmdataexports.*;
 * CfnExportProps cfnExportProps = CfnExportProps.builder()
 * .export(ExportProperty.builder()
 * .dataQuery(DataQueryProperty.builder()
 * .queryStatement("queryStatement")
 * // the properties below are optional
 * .tableConfigurations(Map.of(
 * "tableConfigurationsKey", Map.of(
 * "tableConfigurationsKey", "tableConfigurations")))
 * .build())
 * .destinationConfigurations(DestinationConfigurationsProperty.builder()
 * .s3Destination(S3DestinationProperty.builder()
 * .s3Bucket("s3Bucket")
 * .s3OutputConfigurations(S3OutputConfigurationsProperty.builder()
 * .compression("compression")
 * .format("format")
 * .outputType("outputType")
 * .overwrite("overwrite")
 * .build())
 * .s3Prefix("s3Prefix")
 * .s3Region("s3Region")
 * .build())
 * .build())
 * .name("name")
 * .refreshCadence(RefreshCadenceProperty.builder()
 * .frequency("frequency")
 * .build())
 * // the properties below are optional
 * .description("description")
 * .exportArn("exportArn")
 * .build())
 * // the properties below are optional
 * .tags(List.of(ResourceTagProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bcmdataexports-export.html)
 */
public interface CfnExportProps {
  /**
   * The details that are available for an export.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bcmdataexports-export.html#cfn-bcmdataexports-export-export)
   */
  public fun export(): Any

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bcmdataexports-export.html#cfn-bcmdataexports-export-tags)
   */
  public fun tags(): List<CfnExport.ResourceTagProperty> =
      unwrap(this).getTags()?.map(CfnExport.ResourceTagProperty::wrap) ?: emptyList()

  /**
   * A builder for [CfnExportProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param export The details that are available for an export. 
     */
    public fun export(export: IResolvable)

    /**
     * @param export The details that are available for an export. 
     */
    public fun export(export: CfnExport.ExportProperty)

    /**
     * @param export The details that are available for an export. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fab601fddc38fb1b87676f741edd5dbfe6c38ec7726c7dd36a063c06b3528929")
    public fun export(export: CfnExport.ExportProperty.Builder.() -> Unit)

    /**
     * @param tags the value to be set.
     */
    public fun tags(tags: List<CfnExport.ResourceTagProperty>)

    /**
     * @param tags the value to be set.
     */
    public fun tags(vararg tags: CfnExport.ResourceTagProperty)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.bcmdataexports.CfnExportProps.Builder =
        software.amazon.awscdk.services.bcmdataexports.CfnExportProps.builder()

    /**
     * @param export The details that are available for an export. 
     */
    override fun export(export: IResolvable) {
      cdkBuilder.export(export.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param export The details that are available for an export. 
     */
    override fun export(export: CfnExport.ExportProperty) {
      cdkBuilder.export(export.let(CfnExport.ExportProperty.Companion::unwrap))
    }

    /**
     * @param export The details that are available for an export. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fab601fddc38fb1b87676f741edd5dbfe6c38ec7726c7dd36a063c06b3528929")
    override fun export(export: CfnExport.ExportProperty.Builder.() -> Unit): Unit =
        export(CfnExport.ExportProperty(export))

    /**
     * @param tags the value to be set.
     */
    override fun tags(tags: List<CfnExport.ResourceTagProperty>) {
      cdkBuilder.tags(tags.map(CfnExport.ResourceTagProperty.Companion::unwrap))
    }

    /**
     * @param tags the value to be set.
     */
    override fun tags(vararg tags: CfnExport.ResourceTagProperty): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.bcmdataexports.CfnExportProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.bcmdataexports.CfnExportProps,
  ) : CdkObject(cdkObject), CfnExportProps {
    /**
     * The details that are available for an export.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bcmdataexports-export.html#cfn-bcmdataexports-export-export)
     */
    override fun export(): Any = unwrap(this).getExport()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bcmdataexports-export.html#cfn-bcmdataexports-export-tags)
     */
    override fun tags(): List<CfnExport.ResourceTagProperty> =
        unwrap(this).getTags()?.map(CfnExport.ResourceTagProperty::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnExportProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bcmdataexports.CfnExportProps):
        CfnExportProps = CdkObjectWrappers.wrap(cdkObject) as? CfnExportProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnExportProps):
        software.amazon.awscdk.services.bcmdataexports.CfnExportProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.bcmdataexports.CfnExportProps
  }
}
