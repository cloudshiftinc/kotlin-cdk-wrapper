@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit

/**
 * Example:
 *
 * ```
 * CfnParameter tagParam = new CfnParameter(this, "TagName");
 * CfnJson stringEquals = CfnJson.Builder.create(this, "ConditionJson")
 * .value(Map.of(
 * String.format("aws:PrincipalTag/%s", tagParam.getValueAsString()), true))
 * .build();
 * PrincipalBase principal = new AccountRootPrincipal().withConditions(Map.of(
 * "StringEquals", stringEquals));
 * Role.Builder.create(this, "MyRole").assumedBy(principal).build();
 * ```
 */
public interface CfnJsonProps {
  /**
   * The value to resolve.
   *
   * Can be any JavaScript object, including tokens and
   * references in keys or values.
   */
  public fun `value`(): Any

  /**
   * A builder for [CfnJsonProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param value The value to resolve. 
     * Can be any JavaScript object, including tokens and
     * references in keys or values.
     */
    public fun `value`(`value`: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnJsonProps.Builder =
        software.amazon.awscdk.CfnJsonProps.builder()

    /**
     * @param value The value to resolve. 
     * Can be any JavaScript object, including tokens and
     * references in keys or values.
     */
    override fun `value`(`value`: Any) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.CfnJsonProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnJsonProps,
  ) : CdkObject(cdkObject), CfnJsonProps {
    /**
     * The value to resolve.
     *
     * Can be any JavaScript object, including tokens and
     * references in keys or values.
     */
    override fun `value`(): Any = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnJsonProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnJsonProps): CfnJsonProps =
        CdkObjectWrappers.wrap(cdkObject) as CfnJsonProps

    internal fun unwrap(wrapped: CfnJsonProps): software.amazon.awscdk.CfnJsonProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.CfnJsonProps
  }
}
