@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.panorama

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnPackageProps {
  public fun packageName(): String

  public fun storageLocation(): Any? = unwrap(this).getStorageLocation()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun packageName(packageName: String)

    public fun storageLocation(storageLocation: IResolvable)

    public fun storageLocation(storageLocation: CfnPackage.StorageLocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("682014929884d883a210f1e5dff27f34fc6e6d766cbcc017f53b55ce91b75b6e")
    public
        fun storageLocation(storageLocation: CfnPackage.StorageLocationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.panorama.CfnPackageProps.Builder =
        software.amazon.awscdk.services.panorama.CfnPackageProps.builder()

    override fun packageName(packageName: String) {
      cdkBuilder.packageName(packageName)
    }

    override fun storageLocation(storageLocation: IResolvable) {
      cdkBuilder.storageLocation(storageLocation.let(IResolvable::unwrap))
    }

    override fun storageLocation(storageLocation: CfnPackage.StorageLocationProperty) {
      cdkBuilder.storageLocation(storageLocation.let(CfnPackage.StorageLocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("682014929884d883a210f1e5dff27f34fc6e6d766cbcc017f53b55ce91b75b6e")
    override
        fun storageLocation(storageLocation: CfnPackage.StorageLocationProperty.Builder.() -> Unit):
        Unit = storageLocation(CfnPackage.StorageLocationProperty(storageLocation))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.panorama.CfnPackageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.panorama.CfnPackageProps,
  ) : CdkObject(cdkObject), CfnPackageProps {
    override fun packageName(): String = unwrap(this).getPackageName()

    override fun storageLocation(): Any? = unwrap(this).getStorageLocation()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPackageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.panorama.CfnPackageProps):
        CfnPackageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPackageProps):
        software.amazon.awscdk.services.panorama.CfnPackageProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.panorama.CfnPackageProps
  }
}
