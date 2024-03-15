@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface KeyGroupProps {
  public fun comment(): String? = unwrap(this).getComment()

  public fun items(): List<IPublicKey>

  public fun keyGroupName(): String? = unwrap(this).getKeyGroupName()

  @CdkDslMarker
  public interface Builder {
    public fun comment(comment: String)

    public fun items(items: List<IPublicKey>)

    public fun items(vararg items: IPublicKey)

    public fun keyGroupName(keyGroupName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.KeyGroupProps.Builder =
        software.amazon.awscdk.services.cloudfront.KeyGroupProps.builder()

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun items(items: List<IPublicKey>) {
      cdkBuilder.items(items.map(IPublicKey::unwrap))
    }

    override fun items(vararg items: IPublicKey): Unit = items(items.toList())

    override fun keyGroupName(keyGroupName: String) {
      cdkBuilder.keyGroupName(keyGroupName)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.KeyGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.KeyGroupProps,
  ) : CdkObject(cdkObject), KeyGroupProps {
    override fun comment(): String? = unwrap(this).getComment()

    override fun items(): List<IPublicKey> = unwrap(this).getItems().map(IPublicKey::wrap)

    override fun keyGroupName(): String? = unwrap(this).getKeyGroupName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KeyGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.KeyGroupProps):
        KeyGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: KeyGroupProps):
        software.amazon.awscdk.services.cloudfront.KeyGroupProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudfront.KeyGroupProps
  }
}
