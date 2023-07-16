@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion
import software.constructs.Construct

@CdkDslMarker
public class CfnApplicationVersionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApplicationVersion.Builder =
      CfnApplicationVersion.Builder.create(scope, id)

  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun sourceBundle(sourceBundle: IResolvable) {
    cdkBuilder.sourceBundle(sourceBundle)
  }

  public fun sourceBundle(sourceBundle: CfnApplicationVersion.SourceBundleProperty) {
    cdkBuilder.sourceBundle(sourceBundle)
  }

  public fun build(): CfnApplicationVersion = cdkBuilder.build()
}
