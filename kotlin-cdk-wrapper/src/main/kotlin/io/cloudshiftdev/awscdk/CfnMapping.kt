@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Represents a CloudFormation mapping.
 *
 * Example:
 *
 * ```
 * CfnMapping regionTable = CfnMapping.Builder.create(this, "RegionTable")
 * .mapping(Map.of(
 * "us-east-1", Map.of(
 * "regionName", "US East (N. Virginia)"),
 * "us-east-2", Map.of(
 * "regionName", "US East (Ohio)")))
 * .build();
 * regionTable.findInMap(Aws.REGION, "regionName");
 * ```
 */
public open class CfnMapping(
  cdkObject: software.amazon.awscdk.CfnMapping,
) : CfnRefElement(cdkObject) {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.CfnMapping(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMappingProps,
  ) : this(software.amazon.awscdk.CfnMapping(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnMappingProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMappingProps.Builder.() -> Unit,
  ) : this(scope, id, CfnMappingProps(props)
  )

  /**
   * @return A reference to a value in the map based on the two keys.
   * If mapping is lazy, the value from the map or default value is returned instead of the
   * reference and the mapping is not rendered in the template.
   * @param key1 
   * @param key2 
   * @param defaultValue
   */
  public open fun findInMap(key1: String, key2: String): String = unwrap(this).findInMap(key1, key2)

  /**
   * @return A reference to a value in the map based on the two keys.
   * If mapping is lazy, the value from the map or default value is returned instead of the
   * reference and the mapping is not rendered in the template.
   * @param key1 
   * @param key2 
   * @param defaultValue
   */
  public open fun findInMap(
    key1: String,
    key2: String,
    defaultValue: String,
  ): String = unwrap(this).findInMap(key1, key2, defaultValue)

  /**
   * Sets a value in the map based on the two keys.
   *
   * @param key1 
   * @param key2 
   * @param value 
   */
  public open fun `value`(
    key1: String,
    key2: String,
    `value`: Any,
  ) {
    unwrap(this).setValue(key1, key2, `value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.CfnMapping].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param lazy 
     */
    public fun lazy(lazy: Boolean)

    /**
     * Mapping of key to a set of corresponding set of named values.
     *
     * The key identifies a map of name-value pairs and must be unique within the mapping.
     *
     * For example, if you want to set values based on a region, you can create a mapping
     * that uses the region name as a key and contains the values you want to specify for
     * each specific region.
     *
     * Default: - No mapping.
     *
     * @param mapping Mapping of key to a set of corresponding set of named values. 
     */
    public fun mapping(mapping: Map<String, Map<String, Any>>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnMapping.Builder =
        software.amazon.awscdk.CfnMapping.Builder.create(scope, id)

    /**
     * @param lazy 
     */
    override fun lazy(lazy: Boolean) {
      cdkBuilder.lazy(lazy)
    }

    /**
     * Mapping of key to a set of corresponding set of named values.
     *
     * The key identifies a map of name-value pairs and must be unique within the mapping.
     *
     * For example, if you want to set values based on a region, you can create a mapping
     * that uses the region name as a key and contains the values you want to specify for
     * each specific region.
     *
     * Default: - No mapping.
     *
     * @param mapping Mapping of key to a set of corresponding set of named values. 
     */
    override fun mapping(mapping: Map<String, Map<String, Any>>) {
      cdkBuilder.mapping(mapping)
    }

    public fun build(): software.amazon.awscdk.CfnMapping = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMapping {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMapping(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnMapping): CfnMapping =
        CfnMapping(cdkObject)

    internal fun unwrap(wrapped: CfnMapping): software.amazon.awscdk.CfnMapping = wrapped.cdkObject
        as software.amazon.awscdk.CfnMapping
  }
}
