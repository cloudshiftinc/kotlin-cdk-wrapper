@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.databrew.CfnSchedule
import software.constructs.Construct

@CdkDslMarker
public class CfnScheduleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSchedule.Builder = CfnSchedule.Builder.create(scope, id)

  private val _jobNames: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun cronExpression(cronExpression: String) {
    cdkBuilder.cronExpression(cronExpression)
  }

  public fun jobNames(vararg jobNames: String) {
    _jobNames.addAll(listOf(*jobNames))
  }

  public fun jobNames(jobNames: Collection<String>) {
    _jobNames.addAll(jobNames)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnSchedule {
    if(_jobNames.isNotEmpty()) cdkBuilder.jobNames(_jobNames)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
