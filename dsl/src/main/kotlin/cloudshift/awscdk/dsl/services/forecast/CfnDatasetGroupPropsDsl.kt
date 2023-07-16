@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.forecast

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.forecast.CfnDatasetGroupProps

@CdkDslMarker
public class CfnDatasetGroupPropsDsl {
  private val cdkBuilder: CfnDatasetGroupProps.Builder = CfnDatasetGroupProps.builder()

  private val _datasetArns: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun datasetArns(vararg datasetArns: String) {
    _datasetArns.addAll(listOf(*datasetArns))
  }

  public fun datasetArns(datasetArns: Collection<String>) {
    _datasetArns.addAll(datasetArns)
  }

  public fun datasetGroupName(datasetGroupName: String) {
    cdkBuilder.datasetGroupName(datasetGroupName)
  }

  public fun domain(domain: String) {
    cdkBuilder.domain(domain)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDatasetGroupProps {
    if(_datasetArns.isNotEmpty()) cdkBuilder.datasetArns(_datasetArns)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
