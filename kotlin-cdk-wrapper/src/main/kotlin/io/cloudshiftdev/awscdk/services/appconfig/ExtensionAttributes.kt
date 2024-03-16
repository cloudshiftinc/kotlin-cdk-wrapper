@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Attributes of an existing AWS AppConfig extension to import.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appconfig.*;
 * Action action;
 * ExtensionAttributes extensionAttributes = ExtensionAttributes.builder()
 * .extensionId("extensionId")
 * .extensionVersionNumber(123)
 * // the properties below are optional
 * .actions(List.of(action))
 * .description("description")
 * .extensionArn("extensionArn")
 * .name("name")
 * .build();
 * ```
 */
public interface ExtensionAttributes {
  /**
   * The actions of the extension.
   *
   * Default: - None.
   */
  public fun actions(): List<Action> = unwrap(this).getActions()?.map(Action::wrap) ?: emptyList()

  /**
   * The description of the extension.
   *
   * Default: - None.
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The Amazon Resource Name (ARN) of the extension.
   *
   * Default: - The extension ARN is generated.
   */
  public fun extensionArn(): String? = unwrap(this).getExtensionArn()

  /**
   * The ID of the extension.
   */
  public fun extensionId(): String

  /**
   * The version number of the extension.
   */
  public fun extensionVersionNumber(): Number

  /**
   * The name of the extension.
   *
   * Default: - None.
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A builder for [ExtensionAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actions The actions of the extension.
     */
    public fun actions(actions: List<Action>)

    /**
     * @param actions The actions of the extension.
     */
    public fun actions(vararg actions: Action)

    /**
     * @param description The description of the extension.
     */
    public fun description(description: String)

    /**
     * @param extensionArn The Amazon Resource Name (ARN) of the extension.
     */
    public fun extensionArn(extensionArn: String)

    /**
     * @param extensionId The ID of the extension. 
     */
    public fun extensionId(extensionId: String)

    /**
     * @param extensionVersionNumber The version number of the extension. 
     */
    public fun extensionVersionNumber(extensionVersionNumber: Number)

    /**
     * @param name The name of the extension.
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.ExtensionAttributes.Builder =
        software.amazon.awscdk.services.appconfig.ExtensionAttributes.builder()

    /**
     * @param actions The actions of the extension.
     */
    override fun actions(actions: List<Action>) {
      cdkBuilder.actions(actions.map(Action::unwrap))
    }

    /**
     * @param actions The actions of the extension.
     */
    override fun actions(vararg actions: Action): Unit = actions(actions.toList())

    /**
     * @param description The description of the extension.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param extensionArn The Amazon Resource Name (ARN) of the extension.
     */
    override fun extensionArn(extensionArn: String) {
      cdkBuilder.extensionArn(extensionArn)
    }

    /**
     * @param extensionId The ID of the extension. 
     */
    override fun extensionId(extensionId: String) {
      cdkBuilder.extensionId(extensionId)
    }

    /**
     * @param extensionVersionNumber The version number of the extension. 
     */
    override fun extensionVersionNumber(extensionVersionNumber: Number) {
      cdkBuilder.extensionVersionNumber(extensionVersionNumber)
    }

    /**
     * @param name The name of the extension.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.appconfig.ExtensionAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.ExtensionAttributes,
  ) : CdkObject(cdkObject), ExtensionAttributes {
    /**
     * The actions of the extension.
     *
     * Default: - None.
     */
    override fun actions(): List<Action> = unwrap(this).getActions()?.map(Action::wrap) ?:
        emptyList()

    /**
     * The description of the extension.
     *
     * Default: - None.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The Amazon Resource Name (ARN) of the extension.
     *
     * Default: - The extension ARN is generated.
     */
    override fun extensionArn(): String? = unwrap(this).getExtensionArn()

    /**
     * The ID of the extension.
     */
    override fun extensionId(): String = unwrap(this).getExtensionId()

    /**
     * The version number of the extension.
     */
    override fun extensionVersionNumber(): Number = unwrap(this).getExtensionVersionNumber()

    /**
     * The name of the extension.
     *
     * Default: - None.
     */
    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ExtensionAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.ExtensionAttributes):
        ExtensionAttributes = CdkObjectWrappers.wrap(cdkObject) as ExtensionAttributes

    internal fun unwrap(wrapped: ExtensionAttributes):
        software.amazon.awscdk.services.appconfig.ExtensionAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.ExtensionAttributes
  }
}
