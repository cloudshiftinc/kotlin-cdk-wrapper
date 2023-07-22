@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.ApiDefinitionConfig
import software.amazon.awscdk.services.apigateway.ApiDefinitionS3Location

/**
 * Post-Binding Configuration for a CDK construct.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * Object inlineDefinition;
 * ApiDefinitionConfig apiDefinitionConfig = ApiDefinitionConfig.builder()
 * .inlineDefinition(inlineDefinition)
 * .s3Location(ApiDefinitionS3Location.builder()
 * .bucket("bucket")
 * .key("key")
 * // the properties below are optional
 * .version("version")
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class ApiDefinitionConfigDsl {
  private val cdkBuilder: ApiDefinitionConfig.Builder = ApiDefinitionConfig.builder()

  /**
   * @param inlineDefinition Inline specification (mutually exclusive with `s3Location`).
   */
  public fun inlineDefinition(inlineDefinition: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(inlineDefinition)
    cdkBuilder.inlineDefinition(builder.map)
  }

  /**
   * @param inlineDefinition Inline specification (mutually exclusive with `s3Location`).
   */
  public fun inlineDefinition(inlineDefinition: Any) {
    cdkBuilder.inlineDefinition(inlineDefinition)
  }

  /**
   * @param s3Location The location of the specification in S3 (mutually exclusive with
   * `inlineDefinition`).
   */
  public fun s3Location(s3Location: ApiDefinitionS3LocationDsl.() -> Unit = {}) {
    val builder = ApiDefinitionS3LocationDsl()
    builder.apply(s3Location)
    cdkBuilder.s3Location(builder.build())
  }

  /**
   * @param s3Location The location of the specification in S3 (mutually exclusive with
   * `inlineDefinition`).
   */
  public fun s3Location(s3Location: ApiDefinitionS3Location) {
    cdkBuilder.s3Location(s3Location)
  }

  public fun build(): ApiDefinitionConfig = cdkBuilder.build()
}
