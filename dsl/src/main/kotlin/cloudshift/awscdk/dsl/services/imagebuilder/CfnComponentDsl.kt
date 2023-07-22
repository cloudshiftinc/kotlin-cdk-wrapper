@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.imagebuilder.CfnComponent
import software.constructs.Construct

/**
 * Creates a new component that can be used to build, validate, test, and assess your image.
 *
 * The component is based on a YAML document that you specify using exactly one of the following
 * methods:
 *
 * * Inline, using the `data` property in the request body.
 * * A URL that points to a YAML document file stored in Amazon S3, using the `uri` property in the
 * request body.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * CfnComponent cfnComponent = CfnComponent.Builder.create(this, "MyCfnComponent")
 * .name("name")
 * .platform("platform")
 * .version("version")
 * // the properties below are optional
 * .changeDescription("changeDescription")
 * .data("data")
 * .description("description")
 * .kmsKeyId("kmsKeyId")
 * .supportedOsVersions(List.of("supportedOsVersions"))
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .uri("uri")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html)
 */
@CdkDslMarker
public class CfnComponentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnComponent.Builder = CfnComponent.Builder.create(scope, id)

  private val _supportedOsVersions: MutableList<String> = mutableListOf()

  /**
   * The change description of the component.
   *
   * Describes what change has been made in this version, or what makes this version different from
   * other versions of this component.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-changedescription)
   * @param changeDescription The change description of the component. 
   */
  public fun changeDescription(changeDescription: String) {
    cdkBuilder.changeDescription(changeDescription)
  }

  /**
   * Component `data` contains inline YAML document content for the component.
   *
   * Alternatively, you can specify the `uri` of a YAML document file stored in Amazon S3. However,
   * you cannot specify both properties.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-data)
   * @param data Component `data` contains inline YAML document content for the component. 
   */
  public fun `data`(`data`: String) {
    cdkBuilder.`data`(`data`)
  }

  /**
   * Describes the contents of the component.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-description)
   * @param description Describes the contents of the component. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The ID of the KMS key that is used to encrypt this component.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-kmskeyid)
   * @param kmsKeyId The ID of the KMS key that is used to encrypt this component. 
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * The name of the component.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-name)
   * @param name The name of the component. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The operating system platform of the component.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-platform)
   * @param platform The operating system platform of the component. 
   */
  public fun platform(platform: String) {
    cdkBuilder.platform(platform)
  }

  /**
   * The operating system (OS) version supported by the component.
   *
   * If the OS information is available, a prefix match is performed against the base image OS
   * version during image recipe creation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-supportedosversions)
   * @param supportedOsVersions The operating system (OS) version supported by the component. 
   */
  public fun supportedOsVersions(vararg supportedOsVersions: String) {
    _supportedOsVersions.addAll(listOf(*supportedOsVersions))
  }

  /**
   * The operating system (OS) version supported by the component.
   *
   * If the OS information is available, a prefix match is performed against the base image OS
   * version during image recipe creation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-supportedosversions)
   * @param supportedOsVersions The operating system (OS) version supported by the component. 
   */
  public fun supportedOsVersions(supportedOsVersions: Collection<String>) {
    _supportedOsVersions.addAll(supportedOsVersions)
  }

  /**
   * The tags that apply to the component.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-tags)
   * @param tags The tags that apply to the component. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * The `uri` of a YAML component document file.
   *
   * This must be an S3 URL ( `s3://bucket/key` ), and the requester must have permission to access
   * the S3 bucket it points to. If you use Amazon S3, you can specify component content up to your
   * service quota.
   *
   * Alternatively, you can specify the YAML document inline, using the component `data` property.
   * You cannot specify both properties.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-uri)
   * @param uri The `uri` of a YAML component document file. 
   */
  public fun uri(uri: String) {
    cdkBuilder.uri(uri)
  }

  /**
   * The component version.
   *
   * For example, `1.0.0` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-component.html#cfn-imagebuilder-component-version)
   * @param version The component version. 
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnComponent {
    if(_supportedOsVersions.isNotEmpty()) cdkBuilder.supportedOsVersions(_supportedOsVersions)
    return cdkBuilder.build()
  }
}
