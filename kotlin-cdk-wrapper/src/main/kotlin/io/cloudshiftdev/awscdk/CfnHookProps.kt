@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Construction properties of `CfnHook`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * Object properties;
 * CfnHookProps cfnHookProps = CfnHookProps.builder()
 * .type("type")
 * // the properties below are optional
 * .properties(Map.of(
 * "propertiesKey", properties))
 * .build();
 * ```
 */
public interface CfnHookProps {
  /**
   * The properties of the hook.
   *
   * Default: - no properties
   */
  public fun properties(): Map<String, Any> = unwrap(this).getProperties() ?: emptyMap()

  /**
   * The type of the hook (for example, "AWS::CodeDeploy::BlueGreen").
   */
  public fun type(): String

  /**
   * A builder for [CfnHookProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param properties The properties of the hook.
     */
    public fun properties(properties: Map<String, Any>)

    /**
     * @param type The type of the hook (for example, "AWS::CodeDeploy::BlueGreen"). 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnHookProps.Builder =
        software.amazon.awscdk.CfnHookProps.builder()

    /**
     * @param properties The properties of the hook.
     */
    override fun properties(properties: Map<String, Any>) {
      cdkBuilder.properties(properties.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param type The type of the hook (for example, "AWS::CodeDeploy::BlueGreen"). 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.CfnHookProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.CfnHookProps,
  ) : CdkObject(cdkObject), CfnHookProps {
    /**
     * The properties of the hook.
     *
     * Default: - no properties
     */
    override fun properties(): Map<String, Any> = unwrap(this).getProperties() ?: emptyMap()

    /**
     * The type of the hook (for example, "AWS::CodeDeploy::BlueGreen").
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnHookProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnHookProps): CfnHookProps =
        CdkObjectWrappers.wrap(cdkObject) as? CfnHookProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnHookProps): software.amazon.awscdk.CfnHookProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.CfnHookProps
  }
}
