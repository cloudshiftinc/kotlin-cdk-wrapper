@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnConformancePackProps

@CdkDslMarker
public class CfnConformancePackPropsDsl {
  private val cdkBuilder: CfnConformancePackProps.Builder = CfnConformancePackProps.builder()

  private val _conformancePackInputParameters: MutableList<Any> = mutableListOf()

  /**
   * @param conformancePackInputParameters A list of ConformancePackInputParameter objects.
   */
  public fun conformancePackInputParameters(vararg conformancePackInputParameters: Any) {
    _conformancePackInputParameters.addAll(listOf(*conformancePackInputParameters))
  }

  /**
   * @param conformancePackInputParameters A list of ConformancePackInputParameter objects.
   */
  public fun conformancePackInputParameters(conformancePackInputParameters: Collection<Any>) {
    _conformancePackInputParameters.addAll(conformancePackInputParameters)
  }

  /**
   * @param conformancePackInputParameters A list of ConformancePackInputParameter objects.
   */
  public fun conformancePackInputParameters(conformancePackInputParameters: IResolvable) {
    cdkBuilder.conformancePackInputParameters(conformancePackInputParameters)
  }

  /**
   * @param conformancePackName Name of the conformance pack you want to create. 
   */
  public fun conformancePackName(conformancePackName: String) {
    cdkBuilder.conformancePackName(conformancePackName)
  }

  /**
   * @param deliveryS3Bucket The name of the Amazon S3 bucket where AWS Config stores conformance
   * pack templates.
   */
  public fun deliveryS3Bucket(deliveryS3Bucket: String) {
    cdkBuilder.deliveryS3Bucket(deliveryS3Bucket)
  }

  /**
   * @param deliveryS3KeyPrefix The prefix for the Amazon S3 bucket.
   */
  public fun deliveryS3KeyPrefix(deliveryS3KeyPrefix: String) {
    cdkBuilder.deliveryS3KeyPrefix(deliveryS3KeyPrefix)
  }

  /**
   * @param templateBody A string containing full conformance pack template body.
   * Structure containing the template body with a minimum length of 1 byte and a maximum length of
   * 51,200 bytes.
   *
   *
   * You can only use a YAML template with two resource types: config rule (
   * `AWS::Config::ConfigRule` ) and a remediation action ( `AWS::Config::RemediationConfiguration` ).
   */
  public fun templateBody(templateBody: String) {
    cdkBuilder.templateBody(templateBody)
  }

  /**
   * @param templateS3Uri Location of file containing the template body (s3://bucketname/prefix).
   * The uri must point to the conformance pack template (max size: 300 KB) that is located in an
   * Amazon S3 bucket.
   *
   *
   * You must have access to read Amazon S3 bucket.
   */
  public fun templateS3Uri(templateS3Uri: String) {
    cdkBuilder.templateS3Uri(templateS3Uri)
  }

  /**
   * @param templateSsmDocumentDetails The TemplateSSMDocumentDetails object contains the name of
   * the SSM document and the version of the SSM document.
   */
  public fun templateSsmDocumentDetails(templateSsmDocumentDetails: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(templateSsmDocumentDetails)
    cdkBuilder.templateSsmDocumentDetails(builder.map)
  }

  /**
   * @param templateSsmDocumentDetails The TemplateSSMDocumentDetails object contains the name of
   * the SSM document and the version of the SSM document.
   */
  public fun templateSsmDocumentDetails(templateSsmDocumentDetails: Any) {
    cdkBuilder.templateSsmDocumentDetails(templateSsmDocumentDetails)
  }

  public fun build(): CfnConformancePackProps {
    if(_conformancePackInputParameters.isNotEmpty())
        cdkBuilder.conformancePackInputParameters(_conformancePackInputParameters)
    return cdkBuilder.build()
  }
}
