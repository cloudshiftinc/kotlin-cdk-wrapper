@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecr.CfnRepository
import software.constructs.Construct

@CdkDslMarker
public class CfnRepositoryDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnRepository.Builder = CfnRepository.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The encryption configuration for the repository.
   *
   * This determines how the contents of your repository are encrypted at rest.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-encryptionconfiguration)
   * @param encryptionConfiguration The encryption configuration for the repository. 
   */
  public fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
    cdkBuilder.encryptionConfiguration(encryptionConfiguration)
  }

  /**
   * The encryption configuration for the repository.
   *
   * This determines how the contents of your repository are encrypted at rest.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-encryptionconfiguration)
   * @param encryptionConfiguration The encryption configuration for the repository. 
   */
  public
      fun encryptionConfiguration(encryptionConfiguration: CfnRepository.EncryptionConfigurationProperty) {
    cdkBuilder.encryptionConfiguration(encryptionConfiguration)
  }

  /**
   * The image scanning configuration for the repository.
   *
   * This determines whether images are scanned for known vulnerabilities after being pushed to the
   * repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-imagescanningconfiguration)
   * @param imageScanningConfiguration The image scanning configuration for the repository. 
   */
  public fun imageScanningConfiguration(imageScanningConfiguration: IResolvable) {
    cdkBuilder.imageScanningConfiguration(imageScanningConfiguration)
  }

  /**
   * The image scanning configuration for the repository.
   *
   * This determines whether images are scanned for known vulnerabilities after being pushed to the
   * repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-imagescanningconfiguration)
   * @param imageScanningConfiguration The image scanning configuration for the repository. 
   */
  public
      fun imageScanningConfiguration(imageScanningConfiguration: CfnRepository.ImageScanningConfigurationProperty) {
    cdkBuilder.imageScanningConfiguration(imageScanningConfiguration)
  }

  /**
   * The tag mutability setting for the repository.
   *
   * If this parameter is omitted, the default setting of `MUTABLE` will be used which will allow
   * image tags to be overwritten. If `IMMUTABLE` is specified, all image tags within the repository
   * will be immutable which will prevent them from being overwritten.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-imagetagmutability)
   * @param imageTagMutability The tag mutability setting for the repository. 
   */
  public fun imageTagMutability(imageTagMutability: String) {
    cdkBuilder.imageTagMutability(imageTagMutability)
  }

  /**
   * Creates or updates a lifecycle policy.
   *
   * For information about lifecycle policy syntax, see [Lifecycle policy
   * template](https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-lifecyclepolicy)
   * @param lifecyclePolicy Creates or updates a lifecycle policy. 
   */
  public fun lifecyclePolicy(lifecyclePolicy: IResolvable) {
    cdkBuilder.lifecyclePolicy(lifecyclePolicy)
  }

  /**
   * Creates or updates a lifecycle policy.
   *
   * For information about lifecycle policy syntax, see [Lifecycle policy
   * template](https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-lifecyclepolicy)
   * @param lifecyclePolicy Creates or updates a lifecycle policy. 
   */
  public fun lifecyclePolicy(lifecyclePolicy: CfnRepository.LifecyclePolicyProperty) {
    cdkBuilder.lifecyclePolicy(lifecyclePolicy)
  }

  /**
   * The name to use for the repository.
   *
   * The repository name may be specified on its own (such as `nginx-web-app` ) or it can be
   * prepended with a namespace to group the repository into a category (such as
   * `project-a/nginx-web-app` ). If you don't specify a name, AWS CloudFormation generates a unique
   * physical ID and uses that ID for the repository name. For more information, see [Name
   * type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
   *
   * The repository name must start with a letter and can only contain lowercase letters, numbers,
   * hyphens, underscores, and forward slashes.
   *
   *
   * If you specify a name, you cannot perform updates that require replacement of this resource.
   * You can perform updates that require no or some interruption. If you must replace the resource,
   * specify a new name.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-repositoryname)
   * @param repositoryName The name to use for the repository. 
   */
  public fun repositoryName(repositoryName: String) {
    cdkBuilder.repositoryName(repositoryName)
  }

  /**
   * The JSON repository policy text to apply to the repository.
   *
   * For more information, see [Amazon ECR repository
   * policies](https://docs.aws.amazon.com/AmazonECR/latest/userguide/repository-policy-examples.html)
   * in the *Amazon Elastic Container Registry User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-repositorypolicytext)
   * @param repositoryPolicyText The JSON repository policy text to apply to the repository. 
   */
  public fun repositoryPolicyText(repositoryPolicyText: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(repositoryPolicyText)
    cdkBuilder.repositoryPolicyText(builder.map)
  }

  /**
   * The JSON repository policy text to apply to the repository.
   *
   * For more information, see [Amazon ECR repository
   * policies](https://docs.aws.amazon.com/AmazonECR/latest/userguide/repository-policy-examples.html)
   * in the *Amazon Elastic Container Registry User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-repositorypolicytext)
   * @param repositoryPolicyText The JSON repository policy text to apply to the repository. 
   */
  public fun repositoryPolicyText(repositoryPolicyText: Any) {
    cdkBuilder.repositoryPolicyText(repositoryPolicyText)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnRepository {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
