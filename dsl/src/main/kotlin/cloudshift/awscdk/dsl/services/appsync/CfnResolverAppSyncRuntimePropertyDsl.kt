@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnResolver

/**
 * Describes a runtime used by an AWS AppSync pipeline resolver or AWS AppSync function.
 *
 * Specifies the name and version of the runtime to use. Note that if a runtime is specified, code
 * must also be specified.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * AppSyncRuntimeProperty appSyncRuntimeProperty = AppSyncRuntimeProperty.builder()
 * .name("name")
 * .runtimeVersion("runtimeVersion")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-resolver-appsyncruntime.html)
 */
@CdkDslMarker
public class CfnResolverAppSyncRuntimePropertyDsl {
  private val cdkBuilder: CfnResolver.AppSyncRuntimeProperty.Builder =
      CfnResolver.AppSyncRuntimeProperty.builder()

  /**
   * @param name The `name` of the runtime to use. 
   * Currently, the only allowed value is `APPSYNC_JS` .
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param runtimeVersion The `version` of the runtime to use. 
   * Currently, the only allowed version is `1.0.0` .
   */
  public fun runtimeVersion(runtimeVersion: String) {
    cdkBuilder.runtimeVersion(runtimeVersion)
  }

  public fun build(): CfnResolver.AppSyncRuntimeProperty = cdkBuilder.build()
}
