@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class KeyGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.KeyGroup,
) : Resource(cdkObject), IKeyGroup {
  public override fun keyGroupId(): String = unwrap(this).getKeyGroupId()

  @CdkDslMarker
  public interface Builder {
    public fun comment(comment: String)

    public fun items(items: List<IPublicKey>)

    public fun items(vararg items: IPublicKey)

    public fun keyGroupName(keyGroupName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.KeyGroup.Builder =
        software.amazon.awscdk.services.cloudfront.KeyGroup.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.cloudfront.KeyGroup = cdkBuilder.build()
  }

  public companion object {
    public fun fromKeyGroupId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      keyGroupId: String,
    ): IKeyGroup =
        software.amazon.awscdk.services.cloudfront.KeyGroup.fromKeyGroupId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, keyGroupId).let(IKeyGroup::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): KeyGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return KeyGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.KeyGroup): KeyGroup =
        KeyGroup(cdkObject)

    internal fun unwrap(wrapped: KeyGroup): software.amazon.awscdk.services.cloudfront.KeyGroup =
        wrapped.cdkObject
  }
}
