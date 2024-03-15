@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class KeyValueStore internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.KeyValueStore,
) : Resource(cdkObject), IKeyValueStore {
  public override fun keyValueStoreArn(): String = unwrap(this).getKeyValueStoreArn()

  public override fun keyValueStoreId(): String = unwrap(this).getKeyValueStoreId()

  public override fun keyValueStoreStatus(): String = unwrap(this).getKeyValueStoreStatus()

  @CdkDslMarker
  public interface Builder {
    public fun comment(comment: String)

    public fun keyValueStoreName(keyValueStoreName: String)

    public fun source(source: ImportSource)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.KeyValueStore.Builder =
        software.amazon.awscdk.services.cloudfront.KeyValueStore.Builder.create(scope, id)

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun keyValueStoreName(keyValueStoreName: String) {
      cdkBuilder.keyValueStoreName(keyValueStoreName)
    }

    override fun source(source: ImportSource) {
      cdkBuilder.source(source.let(ImportSource::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.KeyValueStore =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromKeyValueStoreArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      keyValueStoreArn: String,
    ): IKeyValueStore =
        software.amazon.awscdk.services.cloudfront.KeyValueStore.fromKeyValueStoreArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, keyValueStoreArn).let(IKeyValueStore::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): KeyValueStore {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return KeyValueStore(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.KeyValueStore):
        KeyValueStore = KeyValueStore(cdkObject)

    internal fun unwrap(wrapped: KeyValueStore):
        software.amazon.awscdk.services.cloudfront.KeyValueStore = wrapped.cdkObject
  }
}
