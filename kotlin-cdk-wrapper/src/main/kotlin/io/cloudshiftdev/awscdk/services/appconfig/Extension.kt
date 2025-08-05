@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An AWS AppConfig extension.
 *
 * Example:
 *
 * ```
 * Function fn;
 * Extension.Builder.create(this, "MyExtension")
 * .actions(List.of(
 * Action.Builder.create()
 * .actionPoints(List.of(ActionPoint.ON_DEPLOYMENT_START))
 * .eventDestination(new LambdaDestination(fn))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/appconfig/latest/userguide/working-with-appconfig-extensions.html)
 */
public open class Extension(
  cdkObject: software.amazon.awscdk.services.appconfig.Extension,
) : Resource(cdkObject),
    IExtension {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ExtensionProps,
  ) :
      this(software.amazon.awscdk.services.appconfig.Extension(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(ExtensionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ExtensionProps.Builder.() -> Unit,
  ) : this(scope, id, ExtensionProps(props)
  )

  /**
   * The actions for the extension.
   */
  public override fun actions(): List<Action> = unwrap(this).getActions()?.map(Action::wrap) ?:
      emptyList()

  /**
   * The description of the extension.
   */
  public override fun description(): String? = unwrap(this).getDescription()

  /**
   * The Amazon Resource Name (ARN) of the extension.
   */
  public override fun extensionArn(): String = unwrap(this).getExtensionArn()

  /**
   * The ID of the extension.
   */
  public override fun extensionId(): String = unwrap(this).getExtensionId()

  /**
   * The version number of the extension.
   */
  public override fun extensionVersionNumber(): Number = unwrap(this).getExtensionVersionNumber()

  /**
   * The latest version number of the extension.
   */
  public override fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

  /**
   * The name of the extension.
   */
  public override fun name(): String? = unwrap(this).getName()

  /**
   * The parameters of the extension.
   */
  public override fun parameters(): List<Parameter> =
      unwrap(this).getParameters()?.map(Parameter::wrap) ?: emptyList()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appconfig.Extension].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The actions for the extension.
     *
     * @param actions The actions for the extension. 
     */
    public fun actions(actions: List<Action>)

    /**
     * The actions for the extension.
     *
     * @param actions The actions for the extension. 
     */
    public fun actions(vararg actions: Action)

    /**
     * A description of the extension.
     *
     * Default: - No description.
     *
     * @param description A description of the extension. 
     */
    public fun description(description: String)

    /**
     * The name of the extension.
     *
     * Default: - A name is generated.
     *
     * @param extensionName The name of the extension. 
     */
    public fun extensionName(extensionName: String)

    /**
     * The latest version number of the extension.
     *
     * When you create a new version,
     * specify the most recent current version number. For example, you create version 3,
     * enter 2 for this field.
     *
     * Default: - None.
     *
     * @param latestVersionNumber The latest version number of the extension. 
     */
    public fun latestVersionNumber(latestVersionNumber: Number)

    /**
     * The parameters accepted for the extension.
     *
     * Default: - None.
     *
     * @param parameters The parameters accepted for the extension. 
     */
    public fun parameters(parameters: List<Parameter>)

    /**
     * The parameters accepted for the extension.
     *
     * Default: - None.
     *
     * @param parameters The parameters accepted for the extension. 
     */
    public fun parameters(vararg parameters: Parameter)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.Extension.Builder =
        software.amazon.awscdk.services.appconfig.Extension.Builder.create(scope, id)

    /**
     * The actions for the extension.
     *
     * @param actions The actions for the extension. 
     */
    override fun actions(actions: List<Action>) {
      cdkBuilder.actions(actions.map(Action.Companion::unwrap))
    }

    /**
     * The actions for the extension.
     *
     * @param actions The actions for the extension. 
     */
    override fun actions(vararg actions: Action): Unit = actions(actions.toList())

    /**
     * A description of the extension.
     *
     * Default: - No description.
     *
     * @param description A description of the extension. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the extension.
     *
     * Default: - A name is generated.
     *
     * @param extensionName The name of the extension. 
     */
    override fun extensionName(extensionName: String) {
      cdkBuilder.extensionName(extensionName)
    }

    /**
     * The latest version number of the extension.
     *
     * When you create a new version,
     * specify the most recent current version number. For example, you create version 3,
     * enter 2 for this field.
     *
     * Default: - None.
     *
     * @param latestVersionNumber The latest version number of the extension. 
     */
    override fun latestVersionNumber(latestVersionNumber: Number) {
      cdkBuilder.latestVersionNumber(latestVersionNumber)
    }

    /**
     * The parameters accepted for the extension.
     *
     * Default: - None.
     *
     * @param parameters The parameters accepted for the extension. 
     */
    override fun parameters(parameters: List<Parameter>) {
      cdkBuilder.parameters(parameters.map(Parameter.Companion::unwrap))
    }

    /**
     * The parameters accepted for the extension.
     *
     * Default: - None.
     *
     * @param parameters The parameters accepted for the extension. 
     */
    override fun parameters(vararg parameters: Parameter): Unit = parameters(parameters.toList())

    public fun build(): software.amazon.awscdk.services.appconfig.Extension = cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.appconfig.Extension.PROPERTY_INJECTION_ID

    public fun fromExtensionArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      extensionArn: String,
    ): IExtension =
        software.amazon.awscdk.services.appconfig.Extension.fromExtensionArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, extensionArn).let(IExtension::wrap)

    public fun fromExtensionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ExtensionAttributes,
    ): IExtension =
        software.amazon.awscdk.services.appconfig.Extension.fromExtensionAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, attrs.let(ExtensionAttributes.Companion::unwrap)).let(IExtension::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce882774c42632542413b4d9b2d595e936136045b89164d48d255b70c42f21ec")
    public fun fromExtensionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ExtensionAttributes.Builder.() -> Unit,
    ): IExtension = fromExtensionAttributes(scope, id, ExtensionAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Extension {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Extension(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.Extension): Extension =
        Extension(cdkObject)

    internal fun unwrap(wrapped: Extension): software.amazon.awscdk.services.appconfig.Extension =
        wrapped.cdkObject as software.amazon.awscdk.services.appconfig.Extension
  }
}
