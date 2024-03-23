@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A CloudFront Key Value Store.
 *
 * Example:
 *
 * ```
 * KeyValueStore store = KeyValueStore.Builder.create(this, "KeyValueStore")
 * .keyValueStoreName("KeyValueStore")
 * .source(ImportSource.fromAsset("path-to-data.json"))
 * .build();
 * ```
 */
public open class KeyValueStore(
  cdkObject: software.amazon.awscdk.services.cloudfront.KeyValueStore,
) : Resource(cdkObject), IKeyValueStore {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.cloudfront.KeyValueStore(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: KeyValueStoreProps,
  ) :
      this(software.amazon.awscdk.services.cloudfront.KeyValueStore(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(KeyValueStoreProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: KeyValueStoreProps.Builder.() -> Unit,
  ) : this(scope, id, KeyValueStoreProps(props)
  )

  /**
   * The ARN of the Key Value Store.
   */
  public override fun keyValueStoreArn(): String = unwrap(this).getKeyValueStoreArn()

  /**
   * The Unique ID of the Key Value Store.
   */
  public override fun keyValueStoreId(): String = unwrap(this).getKeyValueStoreId()

  /**
   * The status of the Key Value Store.
   */
  public override fun keyValueStoreStatus(): String = unwrap(this).getKeyValueStoreStatus()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.KeyValueStore].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A comment for the Key Value Store.
     *
     * Default: No comment will be specified
     *
     * @param comment A comment for the Key Value Store. 
     */
    public fun comment(comment: String)

    /**
     * The unique name of the Key Value Store.
     *
     * Default: A generated name
     *
     * @param keyValueStoreName The unique name of the Key Value Store. 
     */
    public fun keyValueStoreName(keyValueStoreName: String)

    /**
     * The import source for the Key Value Store.
     *
     * This will populate the initial items in the Key Value Store. The
     * source data must be in a valid JSON format.
     *
     * Default: No data will be imported to the store
     *
     * @param source The import source for the Key Value Store. 
     */
    public fun source(source: ImportSource)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.KeyValueStore.Builder =
        software.amazon.awscdk.services.cloudfront.KeyValueStore.Builder.create(scope, id)

    /**
     * A comment for the Key Value Store.
     *
     * Default: No comment will be specified
     *
     * @param comment A comment for the Key Value Store. 
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * The unique name of the Key Value Store.
     *
     * Default: A generated name
     *
     * @param keyValueStoreName The unique name of the Key Value Store. 
     */
    override fun keyValueStoreName(keyValueStoreName: String) {
      cdkBuilder.keyValueStoreName(keyValueStoreName)
    }

    /**
     * The import source for the Key Value Store.
     *
     * This will populate the initial items in the Key Value Store. The
     * source data must be in a valid JSON format.
     *
     * Default: No data will be imported to the store
     *
     * @param source The import source for the Key Value Store. 
     */
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
        software.amazon.awscdk.services.cloudfront.KeyValueStore = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudfront.KeyValueStore
  }
}
