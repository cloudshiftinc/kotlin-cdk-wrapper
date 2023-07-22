@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.databrew.CfnScheduleProps

@CdkDslMarker
public class CfnSchedulePropsDsl {
  private val cdkBuilder: CfnScheduleProps.Builder = CfnScheduleProps.builder()

  private val _jobNames: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param cronExpression The dates and times when the job is to run. 
   * For more information, see [Working with cron expressions for recipe
   * jobs](https://docs.aws.amazon.com/databrew/latest/dg/jobs.recipe.html#jobs.cron) in the *AWS Glue
   * DataBrew Developer Guide* .
   */
  public fun cronExpression(cronExpression: String) {
    cdkBuilder.cronExpression(cronExpression)
  }

  /**
   * @param jobNames A list of jobs to be run, according to the schedule.
   */
  public fun jobNames(vararg jobNames: String) {
    _jobNames.addAll(listOf(*jobNames))
  }

  /**
   * @param jobNames A list of jobs to be run, according to the schedule.
   */
  public fun jobNames(jobNames: Collection<String>) {
    _jobNames.addAll(jobNames)
  }

  /**
   * @param name The name of the schedule. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param tags Metadata tags that have been applied to the schedule.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Metadata tags that have been applied to the schedule.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnScheduleProps {
    if(_jobNames.isNotEmpty()) cdkBuilder.jobNames(_jobNames)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
