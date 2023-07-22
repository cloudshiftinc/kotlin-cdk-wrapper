@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.ecr.LifecycleRule
import software.amazon.awscdk.services.ecr.RepositoryEncryption
import software.amazon.awscdk.services.ecr.RepositoryProps
import software.amazon.awscdk.services.ecr.TagMutability
import software.amazon.awscdk.services.kms.IKey

/**
 * Example:
 *
 * ```
 * Repository.Builder.create(this, "Repo").imageTagMutability(TagMutability.IMMUTABLE).build();
 * ```
 */
@CdkDslMarker
public class RepositoryPropsDsl {
  private val cdkBuilder: RepositoryProps.Builder = RepositoryProps.builder()

  private val _lifecycleRules: MutableList<LifecycleRule> = mutableListOf()

  /**
   * @param autoDeleteImages Whether all images should be automatically deleted when the repository
   * is removed from the stack or when the stack is deleted.
   * Requires the `removalPolicy` to be set to `RemovalPolicy.DESTROY`.
   */
  public fun autoDeleteImages(autoDeleteImages: Boolean) {
    cdkBuilder.autoDeleteImages(autoDeleteImages)
  }

  /**
   * @param encryption The kind of server-side encryption to apply to this repository.
   * If you choose KMS, you can specify a KMS key via `encryptionKey`. If
   * encryptionKey is not specified, an AWS managed KMS key is used.
   */
  public fun encryption(encryption: RepositoryEncryption) {
    cdkBuilder.encryption(encryption)
  }

  /**
   * @param encryptionKey External KMS key to use for repository encryption.
   * The 'encryption' property must be either not specified or set to "KMS".
   * An error will be emitted if encryption is set to "AES256".
   */
  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  /**
   * @param imageScanOnPush Enable the scan on push when creating the repository.
   */
  public fun imageScanOnPush(imageScanOnPush: Boolean) {
    cdkBuilder.imageScanOnPush(imageScanOnPush)
  }

  /**
   * @param imageTagMutability The tag mutability setting for the repository.
   * If this parameter is omitted, the default setting of MUTABLE will be used which will allow
   * image tags to be overwritten.
   */
  public fun imageTagMutability(imageTagMutability: TagMutability) {
    cdkBuilder.imageTagMutability(imageTagMutability)
  }

  /**
   * @param lifecycleRegistryId The AWS account ID associated with the registry that contains the
   * repository.
   */
  public fun lifecycleRegistryId(lifecycleRegistryId: String) {
    cdkBuilder.lifecycleRegistryId(lifecycleRegistryId)
  }

  /**
   * @param lifecycleRules Life cycle rules to apply to this registry.
   */
  public fun lifecycleRules(lifecycleRules: LifecycleRuleDsl.() -> Unit) {
    _lifecycleRules.add(LifecycleRuleDsl().apply(lifecycleRules).build())
  }

  /**
   * @param lifecycleRules Life cycle rules to apply to this registry.
   */
  public fun lifecycleRules(lifecycleRules: Collection<LifecycleRule>) {
    _lifecycleRules.addAll(lifecycleRules)
  }

  /**
   * @param removalPolicy Determine what happens to the repository when the resource/stack is
   * deleted.
   */
  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  /**
   * @param repositoryName Name for this repository.
   */
  public fun repositoryName(repositoryName: String) {
    cdkBuilder.repositoryName(repositoryName)
  }

  public fun build(): RepositoryProps {
    if(_lifecycleRules.isNotEmpty()) cdkBuilder.lifecycleRules(_lifecycleRules)
    return cdkBuilder.build()
  }
}
