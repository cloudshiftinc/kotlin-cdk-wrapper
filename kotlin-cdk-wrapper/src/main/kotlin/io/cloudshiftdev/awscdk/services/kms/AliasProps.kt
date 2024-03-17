@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kms

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Construction properties for a KMS Key Alias object.
 *
 * Example:
 *
 * ```
 * // Passing an encrypted replication bucket created in a different stack.
 * App app = new App();
 * Stack replicationStack = Stack.Builder.create(app, "ReplicationStack")
 * .env(Environment.builder()
 * .region("us-west-1")
 * .build())
 * .build();
 * Key key = new Key(replicationStack, "ReplicationKey");
 * Alias alias = Alias.Builder.create(replicationStack, "ReplicationAlias")
 * // aliasName is required
 * .aliasName(PhysicalName.GENERATE_IF_NEEDED)
 * .targetKey(key)
 * .build();
 * Bucket replicationBucket = Bucket.Builder.create(replicationStack, "ReplicationBucket")
 * .bucketName(PhysicalName.GENERATE_IF_NEEDED)
 * .encryptionKey(alias)
 * .build();
 * ```
 */
public interface AliasProps {
  /**
   * The name of the alias.
   *
   * The name must start with alias followed by a
   * forward slash, such as alias/. You can't specify aliases that begin with
   * alias/AWS. These aliases are reserved.
   */
  public fun aliasName(): String

  /**
   * Policy to apply when the alias is removed from this stack.
   *
   * Default: - The alias will be deleted
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * The ID of the key for which you are creating the alias.
   *
   * Specify the key's
   * globally unique identifier or Amazon Resource Name (ARN). You can't
   * specify another alias.
   */
  public fun targetKey(): IKey

  /**
   * A builder for [AliasProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param aliasName The name of the alias. 
     * The name must start with alias followed by a
     * forward slash, such as alias/. You can't specify aliases that begin with
     * alias/AWS. These aliases are reserved.
     */
    public fun aliasName(aliasName: String)

    /**
     * @param removalPolicy Policy to apply when the alias is removed from this stack.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * @param targetKey The ID of the key for which you are creating the alias. 
     * Specify the key's
     * globally unique identifier or Amazon Resource Name (ARN). You can't
     * specify another alias.
     */
    public fun targetKey(targetKey: IKey)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kms.AliasProps.Builder =
        software.amazon.awscdk.services.kms.AliasProps.builder()

    /**
     * @param aliasName The name of the alias. 
     * The name must start with alias followed by a
     * forward slash, such as alias/. You can't specify aliases that begin with
     * alias/AWS. These aliases are reserved.
     */
    override fun aliasName(aliasName: String) {
      cdkBuilder.aliasName(aliasName)
    }

    /**
     * @param removalPolicy Policy to apply when the alias is removed from this stack.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * @param targetKey The ID of the key for which you are creating the alias. 
     * Specify the key's
     * globally unique identifier or Amazon Resource Name (ARN). You can't
     * specify another alias.
     */
    override fun targetKey(targetKey: IKey) {
      cdkBuilder.targetKey(targetKey.let(IKey::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.kms.AliasProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kms.AliasProps,
  ) : CdkObject(cdkObject), AliasProps {
    /**
     * The name of the alias.
     *
     * The name must start with alias followed by a
     * forward slash, such as alias/. You can't specify aliases that begin with
     * alias/AWS. These aliases are reserved.
     */
    override fun aliasName(): String = unwrap(this).getAliasName()

    /**
     * Policy to apply when the alias is removed from this stack.
     *
     * Default: - The alias will be deleted
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * The ID of the key for which you are creating the alias.
     *
     * Specify the key's
     * globally unique identifier or Amazon Resource Name (ARN). You can't
     * specify another alias.
     */
    override fun targetKey(): IKey = unwrap(this).getTargetKey().let(IKey::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AliasProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.AliasProps): AliasProps =
        CdkObjectWrappers.wrap(cdkObject) as? AliasProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AliasProps): software.amazon.awscdk.services.kms.AliasProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.kms.AliasProps
  }
}
