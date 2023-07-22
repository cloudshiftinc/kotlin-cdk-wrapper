@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnArchive
import software.constructs.Construct

@CdkDslMarker
public class CfnArchiveDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnArchive.Builder = CfnArchive.Builder.create(scope, id)

  /**
   * The name for the archive to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html#cfn-events-archive-archivename)
   * @param archiveName The name for the archive to create. 
   */
  public fun archiveName(archiveName: String) {
    cdkBuilder.archiveName(archiveName)
  }

  /**
   * A description for the archive.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html#cfn-events-archive-description)
   * @param description A description for the archive. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * An event pattern to use to filter events sent to the archive.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html#cfn-events-archive-eventpattern)
   * @param eventPattern An event pattern to use to filter events sent to the archive. 
   */
  public fun eventPattern(eventPattern: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(eventPattern)
    cdkBuilder.eventPattern(builder.map)
  }

  /**
   * An event pattern to use to filter events sent to the archive.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html#cfn-events-archive-eventpattern)
   * @param eventPattern An event pattern to use to filter events sent to the archive. 
   */
  public fun eventPattern(eventPattern: Any) {
    cdkBuilder.eventPattern(eventPattern)
  }

  /**
   * The number of days to retain events for.
   *
   * Default value is 0. If set to 0, events are retained indefinitely
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html#cfn-events-archive-retentiondays)
   * @param retentionDays The number of days to retain events for. 
   */
  public fun retentionDays(retentionDays: Number) {
    cdkBuilder.retentionDays(retentionDays)
  }

  /**
   * The ARN of the event bus that sends events to the archive.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-archive.html#cfn-events-archive-sourcearn)
   * @param sourceArn The ARN of the event bus that sends events to the archive. 
   */
  public fun sourceArn(sourceArn: String) {
    cdkBuilder.sourceArn(sourceArn)
  }

  public fun build(): CfnArchive = cdkBuilder.build()
}
