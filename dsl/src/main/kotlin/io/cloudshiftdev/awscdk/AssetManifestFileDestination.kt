package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface AssetManifestFileDestination {
  /**
   * Bucket name where the file asset should be written.
   */
  public fun bucketName(): String

  /**
   * Prefix to prepend to the asset hash.
   *
   * Default: ''
   */
  public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

  /**
   * Role to use for uploading.
   *
   * Default: - current role
   */
  public fun role(): RoleOptions? = unwrap(this).getRole()?.let(RoleOptions::wrap)

  /**
   * A builder for [AssetManifestFileDestination]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucketName Bucket name where the file asset should be written. 
     */
    public fun bucketName(bucketName: String)

    /**
     * @param bucketPrefix Prefix to prepend to the asset hash.
     */
    public fun bucketPrefix(bucketPrefix: String)

    /**
     * @param role Role to use for uploading.
     */
    public fun role(role: RoleOptions)

    /**
     * @param role Role to use for uploading.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("603c92d970781af6be4942f5af54024a02a6813eb01dd74755ce762e0d5ec748")
    public fun role(role: RoleOptions.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.AssetManifestFileDestination.Builder =
        software.amazon.awscdk.AssetManifestFileDestination.builder()

    /**
     * @param bucketName Bucket name where the file asset should be written. 
     */
    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param bucketPrefix Prefix to prepend to the asset hash.
     */
    override fun bucketPrefix(bucketPrefix: String) {
      cdkBuilder.bucketPrefix(bucketPrefix)
    }

    /**
     * @param role Role to use for uploading.
     */
    override fun role(role: RoleOptions) {
      cdkBuilder.role(role.let(RoleOptions::unwrap))
    }

    /**
     * @param role Role to use for uploading.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("603c92d970781af6be4942f5af54024a02a6813eb01dd74755ce762e0d5ec748")
    override fun role(role: RoleOptions.Builder.() -> Unit): Unit = role(RoleOptions(role))

    public fun build(): software.amazon.awscdk.AssetManifestFileDestination = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.AssetManifestFileDestination,
  ) : CdkObject(cdkObject), AssetManifestFileDestination {
    /**
     * Bucket name where the file asset should be written.
     */
    override fun bucketName(): String = unwrap(this).getBucketName()

    /**
     * Prefix to prepend to the asset hash.
     *
     * Default: ''
     */
    override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

    /**
     * Role to use for uploading.
     *
     * Default: - current role
     */
    override fun role(): RoleOptions? = unwrap(this).getRole()?.let(RoleOptions::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AssetManifestFileDestination {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.AssetManifestFileDestination):
        AssetManifestFileDestination = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AssetManifestFileDestination):
        software.amazon.awscdk.AssetManifestFileDestination = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.AssetManifestFileDestination
  }
}
