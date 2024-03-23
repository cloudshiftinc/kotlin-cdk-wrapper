@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Example:
 *
 * ```
 * CfnMapping regionTable = CfnMapping.Builder.create(this, "RegionTable")
 * .mapping(Map.of(
 * "us-east-1", Map.of(
 * "regionName", "US East (N. Virginia)"),
 * "us-east-2", Map.of(
 * "regionName", "US East (Ohio)")))
 * .lazy(true)
 * .build();
 * regionTable.findInMap("us-east-2", "regionName");
 * ```
 */
public interface CfnMappingProps {
  /**
   *
   */
  public fun lazy(): Boolean? = unwrap(this).getLazy()

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
   */
  public fun mapping(): Map<String, Map<String, Any>> = unwrap(this).getMapping() ?: emptyMap()

  /**
   * A builder for [CfnMappingProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param lazy the value to be set.
     */
    public fun lazy(lazy: Boolean)

    /**
     * @param mapping Mapping of key to a set of corresponding set of named values.
     * The key identifies a map of name-value pairs and must be unique within the mapping.
     *
     * For example, if you want to set values based on a region, you can create a mapping
     * that uses the region name as a key and contains the values you want to specify for
     * each specific region.
     */
    public fun mapping(mapping: Map<String, Map<String, Any>>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnMappingProps.Builder =
        software.amazon.awscdk.CfnMappingProps.builder()

    /**
     * @param lazy the value to be set.
     */
    override fun lazy(lazy: Boolean) {
      cdkBuilder.lazy(lazy)
    }

    /**
     * @param mapping Mapping of key to a set of corresponding set of named values.
     * The key identifies a map of name-value pairs and must be unique within the mapping.
     *
     * For example, if you want to set values based on a region, you can create a mapping
     * that uses the region name as a key and contains the values you want to specify for
     * each specific region.
     */
    override fun mapping(mapping: Map<String, Map<String, Any>>) {
      cdkBuilder.mapping(mapping)
    }

    public fun build(): software.amazon.awscdk.CfnMappingProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.CfnMappingProps,
  ) : CdkObject(cdkObject), CfnMappingProps {
    /**
     *
     */
    override fun lazy(): Boolean? = unwrap(this).getLazy()

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
     */
    override fun mapping(): Map<String, Map<String, Any>> = unwrap(this).getMapping() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMappingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnMappingProps): CfnMappingProps =
        CdkObjectWrappers.wrap(cdkObject) as? CfnMappingProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMappingProps): software.amazon.awscdk.CfnMappingProps = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.CfnMappingProps
  }
}
