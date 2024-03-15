@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface AssetManifestFileDestination {
  public fun bucketName(): String

  public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

  public fun role(): RoleOptions? = unwrap(this).getRole()?.let(RoleOptions::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun bucketName(bucketName: String)

    public fun bucketPrefix(bucketPrefix: String)

    public fun role(role: RoleOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("603c92d970781af6be4942f5af54024a02a6813eb01dd74755ce762e0d5ec748")
    public fun role(role: RoleOptions.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.AssetManifestFileDestination.Builder =
        software.amazon.awscdk.AssetManifestFileDestination.builder()

    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    override fun bucketPrefix(bucketPrefix: String) {
      cdkBuilder.bucketPrefix(bucketPrefix)
    }

    override fun role(role: RoleOptions) {
      cdkBuilder.role(role.let(RoleOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("603c92d970781af6be4942f5af54024a02a6813eb01dd74755ce762e0d5ec748")
    override fun role(role: RoleOptions.Builder.() -> Unit): Unit = role(RoleOptions(role))

    public fun build(): software.amazon.awscdk.AssetManifestFileDestination = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.AssetManifestFileDestination,
  ) : CdkObject(cdkObject), AssetManifestFileDestination {
    override fun bucketName(): String = unwrap(this).getBucketName()

    override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

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
