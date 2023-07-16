@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.inspectorv2

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.inspectorv2.CfnFilter
import software.amazon.awscdk.services.inspectorv2.CfnFilterProps
import software.constructs.Construct

public object inspectorv2 {
  public inline fun cfnFilter(
    scope: Construct,
    id: String,
    block: CfnFilterDsl.() -> Unit = {},
  ): CfnFilter {
    val builder = CfnFilterDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFilterDateFilterProperty(block: CfnFilterDateFilterPropertyDsl.() -> Unit =
      {}): CfnFilter.DateFilterProperty {
    val builder = CfnFilterDateFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFilterFilterCriteriaProperty(block: CfnFilterFilterCriteriaPropertyDsl.() -> Unit =
      {}): CfnFilter.FilterCriteriaProperty {
    val builder = CfnFilterFilterCriteriaPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFilterMapFilterProperty(block: CfnFilterMapFilterPropertyDsl.() -> Unit =
      {}): CfnFilter.MapFilterProperty {
    val builder = CfnFilterMapFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFilterNumberFilterProperty(block: CfnFilterNumberFilterPropertyDsl.() -> Unit
      = {}): CfnFilter.NumberFilterProperty {
    val builder = CfnFilterNumberFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFilterPackageFilterProperty(block: CfnFilterPackageFilterPropertyDsl.() -> Unit = {}):
      CfnFilter.PackageFilterProperty {
    val builder = CfnFilterPackageFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFilterPortRangeFilterProperty(block: CfnFilterPortRangeFilterPropertyDsl.() -> Unit =
      {}): CfnFilter.PortRangeFilterProperty {
    val builder = CfnFilterPortRangeFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFilterProps(block: CfnFilterPropsDsl.() -> Unit = {}): CfnFilterProps {
    val builder = CfnFilterPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFilterStringFilterProperty(block: CfnFilterStringFilterPropertyDsl.() -> Unit
      = {}): CfnFilter.StringFilterProperty {
    val builder = CfnFilterStringFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
