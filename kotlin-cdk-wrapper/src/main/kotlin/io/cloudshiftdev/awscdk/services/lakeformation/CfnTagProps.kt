@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lakeformation

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnTagProps {
  public fun catalogId(): String? = unwrap(this).getCatalogId()

  public fun tagKey(): String

  public fun tagValues(): List<String>

  @CdkDslMarker
  public interface Builder {
    public fun catalogId(catalogId: String)

    public fun tagKey(tagKey: String)

    public fun tagValues(tagValues: List<String>)

    public fun tagValues(vararg tagValues: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lakeformation.CfnTagProps.Builder =
        software.amazon.awscdk.services.lakeformation.CfnTagProps.builder()

    override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    override fun tagKey(tagKey: String) {
      cdkBuilder.tagKey(tagKey)
    }

    override fun tagValues(tagValues: List<String>) {
      cdkBuilder.tagValues(tagValues)
    }

    override fun tagValues(vararg tagValues: String): Unit = tagValues(tagValues.toList())

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnTagProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lakeformation.CfnTagProps,
  ) : CdkObject(cdkObject), CfnTagProps {
    override fun catalogId(): String? = unwrap(this).getCatalogId()

    override fun tagKey(): String = unwrap(this).getTagKey()

    override fun tagValues(): List<String> = unwrap(this).getTagValues()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTagProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnTagProps):
        CfnTagProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTagProps):
        software.amazon.awscdk.services.lakeformation.CfnTagProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.lakeformation.CfnTagProps
  }
}
