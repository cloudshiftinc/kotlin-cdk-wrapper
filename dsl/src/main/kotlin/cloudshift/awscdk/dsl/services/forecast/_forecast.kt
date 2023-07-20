@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.forecast

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.forecast.CfnDataset
import software.amazon.awscdk.services.forecast.CfnDatasetGroup
import software.amazon.awscdk.services.forecast.CfnDatasetGroupProps
import software.amazon.awscdk.services.forecast.CfnDatasetProps
import software.constructs.Construct

public object forecast {
  public inline fun cfnDataset(
    scope: Construct,
    id: String,
    block: CfnDatasetDsl.() -> Unit = {},
  ): CfnDataset {
    val builder = CfnDatasetDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDatasetAttributesItemsProperty(block: CfnDatasetAttributesItemsPropertyDsl.() -> Unit =
      {}): CfnDataset.AttributesItemsProperty {
    val builder = CfnDatasetAttributesItemsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDatasetEncryptionConfigProperty(block: CfnDatasetEncryptionConfigPropertyDsl.() -> Unit
      = {}): CfnDataset.EncryptionConfigProperty {
    val builder = CfnDatasetEncryptionConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDatasetGroup(
    scope: Construct,
    id: String,
    block: CfnDatasetGroupDsl.() -> Unit = {},
  ): CfnDatasetGroup {
    val builder = CfnDatasetGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDatasetGroupProps(block: CfnDatasetGroupPropsDsl.() -> Unit = {}):
      CfnDatasetGroupProps {
    val builder = CfnDatasetGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDatasetProps(block: CfnDatasetPropsDsl.() -> Unit = {}): CfnDatasetProps {
    val builder = CfnDatasetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDatasetSchemaProperty(block: CfnDatasetSchemaPropertyDsl.() -> Unit = {}):
      CfnDataset.SchemaProperty {
    val builder = CfnDatasetSchemaPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDatasetTagsItemsProperty(block: CfnDatasetTagsItemsPropertyDsl.() -> Unit =
      {}): CfnDataset.TagsItemsProperty {
    val builder = CfnDatasetTagsItemsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
