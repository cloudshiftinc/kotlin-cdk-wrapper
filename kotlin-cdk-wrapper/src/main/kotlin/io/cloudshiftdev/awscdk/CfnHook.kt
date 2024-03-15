@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Represents a CloudFormation resource.
 *
 * Example:
 *
 * ```
 * CfnInclude cfnTemplate;
 * // mutating the hook
 * Role myRole;
 * CfnHook hook = cfnTemplate.getHook("MyOutput");
 * CfnCodeDeployBlueGreenHook codeDeployHook = (CfnCodeDeployBlueGreenHook)hook;
 * codeDeployHook.getServiceRole() = myRole.getRoleArn();
 * ```
 */
public open class CfnHook internal constructor(
  internal override val cdkObject: software.amazon.awscdk.CfnHook,
) : CfnElement(cdkObject) {
  /**
   * The type of the hook (for example, "AWS::CodeDeploy::BlueGreen").
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.CfnHook].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The properties of the hook.
     *
     * Default: - no properties
     *
     * @param properties The properties of the hook. 
     */
    public fun properties(properties: Map<String, Any>)

    /**
     * The type of the hook (for example, "AWS::CodeDeploy::BlueGreen").
     *
     * @param type The type of the hook (for example, "AWS::CodeDeploy::BlueGreen"). 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnHook.Builder =
        software.amazon.awscdk.CfnHook.Builder.create(scope, id)

    /**
     * The properties of the hook.
     *
     * Default: - no properties
     *
     * @param properties The properties of the hook. 
     */
    override fun properties(properties: Map<String, Any>) {
      cdkBuilder.properties(properties)
    }

    /**
     * The type of the hook (for example, "AWS::CodeDeploy::BlueGreen").
     *
     * @param type The type of the hook (for example, "AWS::CodeDeploy::BlueGreen"). 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.CfnHook = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnHook {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnHook(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnHook): CfnHook = CfnHook(cdkObject)

    internal fun unwrap(wrapped: CfnHook): software.amazon.awscdk.CfnHook = wrapped.cdkObject
  }
}
