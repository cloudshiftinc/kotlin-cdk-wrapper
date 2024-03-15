@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnStorageLensProps {
  public fun storageLensConfiguration(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun storageLensConfiguration(storageLensConfiguration: IResolvable)

    public
        fun storageLensConfiguration(storageLensConfiguration: CfnStorageLens.StorageLensConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b28c891acedc066585e8d67f043aeddb36a05c451ee1e66097cafe3a3ad52376")
    public
        fun storageLensConfiguration(storageLensConfiguration: CfnStorageLens.StorageLensConfigurationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnStorageLensProps.Builder =
        software.amazon.awscdk.services.s3.CfnStorageLensProps.builder()

    override fun storageLensConfiguration(storageLensConfiguration: IResolvable) {
      cdkBuilder.storageLensConfiguration(storageLensConfiguration.let(IResolvable::unwrap))
    }

    override
        fun storageLensConfiguration(storageLensConfiguration: CfnStorageLens.StorageLensConfigurationProperty) {
      cdkBuilder.storageLensConfiguration(storageLensConfiguration.let(CfnStorageLens.StorageLensConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b28c891acedc066585e8d67f043aeddb36a05c451ee1e66097cafe3a3ad52376")
    override
        fun storageLensConfiguration(storageLensConfiguration: CfnStorageLens.StorageLensConfigurationProperty.Builder.() -> Unit):
        Unit =
        storageLensConfiguration(CfnStorageLens.StorageLensConfigurationProperty(storageLensConfiguration))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.s3.CfnStorageLensProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensProps,
  ) : CdkObject(cdkObject), CfnStorageLensProps {
    override fun storageLensConfiguration(): Any = unwrap(this).getStorageLensConfiguration()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStorageLensProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensProps):
        CfnStorageLensProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStorageLensProps):
        software.amazon.awscdk.services.s3.CfnStorageLensProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.s3.CfnStorageLensProps
  }
}
