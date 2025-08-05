@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The details about the specified action configured for an environment.
 *
 * For example, the details of the specified console links for an analytics tool that is available
 * in this environment.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datazone.*;
 * CfnEnvironmentActions cfnEnvironmentActions = CfnEnvironmentActions.Builder.create(this,
 * "MyCfnEnvironmentActions")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .domainIdentifier("domainIdentifier")
 * .environmentIdentifier("environmentIdentifier")
 * .identifier("identifier")
 * .parameters(AwsConsoleLinkParametersProperty.builder()
 * .uri("uri")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html)
 */
public open class CfnEnvironmentActions(
  cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentActions,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEnvironmentActionsProps,
  ) :
      this(software.amazon.awscdk.services.datazone.CfnEnvironmentActions(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnEnvironmentActionsProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEnvironmentActionsProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEnvironmentActionsProps(props)
  )

  /**
   * The Amazon DataZone domain ID of the environment action.
   */
  public open fun attrDomainId(): String = unwrap(this).getAttrDomainId()

  /**
   * The environment ID of the environment action.
   */
  public open fun attrEnvironmentId(): String = unwrap(this).getAttrEnvironmentId()

  /**
   * The ID of the environment action.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The environment action description.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The environment action description.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The Amazon DataZone domain ID of the environment action.
   */
  public open fun domainIdentifier(): String? = unwrap(this).getDomainIdentifier()

  /**
   * The Amazon DataZone domain ID of the environment action.
   */
  public open fun domainIdentifier(`value`: String) {
    unwrap(this).setDomainIdentifier(`value`)
  }

  /**
   * The environment ID of the environment action.
   */
  public open fun environmentIdentifier(): String? = unwrap(this).getEnvironmentIdentifier()

  /**
   * The environment ID of the environment action.
   */
  public open fun environmentIdentifier(`value`: String) {
    unwrap(this).setEnvironmentIdentifier(`value`)
  }

  /**
   * The ID of the environment action.
   */
  public open fun identifier(): String? = unwrap(this).getIdentifier()

  /**
   * The ID of the environment action.
   */
  public open fun identifier(`value`: String) {
    unwrap(this).setIdentifier(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the environment action.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the environment action.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The parameters of the environment action.
   */
  public open fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * The parameters of the environment action.
   */
  public open fun parameters(`value`: IResolvable) {
    unwrap(this).setParameters(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The parameters of the environment action.
   */
  public open fun parameters(`value`: AwsConsoleLinkParametersProperty) {
    unwrap(this).setParameters(`value`.let(AwsConsoleLinkParametersProperty.Companion::unwrap))
  }

  /**
   * The parameters of the environment action.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dd6d337866bc63257ccf94888fcf9a120a7d83c116526345a4d37a3cbfeadab8")
  public open fun parameters(`value`: AwsConsoleLinkParametersProperty.Builder.() -> Unit): Unit =
      parameters(AwsConsoleLinkParametersProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.datazone.CfnEnvironmentActions].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The environment action description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html#cfn-datazone-environmentactions-description)
     * @param description The environment action description. 
     */
    public fun description(description: String)

    /**
     * The Amazon DataZone domain ID of the environment action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html#cfn-datazone-environmentactions-domainidentifier)
     * @param domainIdentifier The Amazon DataZone domain ID of the environment action. 
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * The environment ID of the environment action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html#cfn-datazone-environmentactions-environmentidentifier)
     * @param environmentIdentifier The environment ID of the environment action. 
     */
    public fun environmentIdentifier(environmentIdentifier: String)

    /**
     * The ID of the environment action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html#cfn-datazone-environmentactions-identifier)
     * @param identifier The ID of the environment action. 
     */
    public fun identifier(identifier: String)

    /**
     * The name of the environment action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html#cfn-datazone-environmentactions-name)
     * @param name The name of the environment action. 
     */
    public fun name(name: String)

    /**
     * The parameters of the environment action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html#cfn-datazone-environmentactions-parameters)
     * @param parameters The parameters of the environment action. 
     */
    public fun parameters(parameters: IResolvable)

    /**
     * The parameters of the environment action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html#cfn-datazone-environmentactions-parameters)
     * @param parameters The parameters of the environment action. 
     */
    public fun parameters(parameters: AwsConsoleLinkParametersProperty)

    /**
     * The parameters of the environment action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html#cfn-datazone-environmentactions-parameters)
     * @param parameters The parameters of the environment action. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("07f721f53aaaaa562d7534a76496b990cb9f6ff2c36fb208d27829fa9cbd4e72")
    public fun parameters(parameters: AwsConsoleLinkParametersProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnEnvironmentActions.Builder =
        software.amazon.awscdk.services.datazone.CfnEnvironmentActions.Builder.create(scope, id)

    /**
     * The environment action description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html#cfn-datazone-environmentactions-description)
     * @param description The environment action description. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The Amazon DataZone domain ID of the environment action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html#cfn-datazone-environmentactions-domainidentifier)
     * @param domainIdentifier The Amazon DataZone domain ID of the environment action. 
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * The environment ID of the environment action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html#cfn-datazone-environmentactions-environmentidentifier)
     * @param environmentIdentifier The environment ID of the environment action. 
     */
    override fun environmentIdentifier(environmentIdentifier: String) {
      cdkBuilder.environmentIdentifier(environmentIdentifier)
    }

    /**
     * The ID of the environment action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html#cfn-datazone-environmentactions-identifier)
     * @param identifier The ID of the environment action. 
     */
    override fun identifier(identifier: String) {
      cdkBuilder.identifier(identifier)
    }

    /**
     * The name of the environment action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html#cfn-datazone-environmentactions-name)
     * @param name The name of the environment action. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The parameters of the environment action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html#cfn-datazone-environmentactions-parameters)
     * @param parameters The parameters of the environment action. 
     */
    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * The parameters of the environment action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html#cfn-datazone-environmentactions-parameters)
     * @param parameters The parameters of the environment action. 
     */
    override fun parameters(parameters: AwsConsoleLinkParametersProperty) {
      cdkBuilder.parameters(parameters.let(AwsConsoleLinkParametersProperty.Companion::unwrap))
    }

    /**
     * The parameters of the environment action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-environmentactions.html#cfn-datazone-environmentactions-parameters)
     * @param parameters The parameters of the environment action. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("07f721f53aaaaa562d7534a76496b990cb9f6ff2c36fb208d27829fa9cbd4e72")
    override fun parameters(parameters: AwsConsoleLinkParametersProperty.Builder.() -> Unit): Unit =
        parameters(AwsConsoleLinkParametersProperty(parameters))

    public fun build(): software.amazon.awscdk.services.datazone.CfnEnvironmentActions =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.datazone.CfnEnvironmentActions.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEnvironmentActions {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEnvironmentActions(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentActions):
        CfnEnvironmentActions = CfnEnvironmentActions(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentActions):
        software.amazon.awscdk.services.datazone.CfnEnvironmentActions = wrapped.cdkObject as
        software.amazon.awscdk.services.datazone.CfnEnvironmentActions
  }

  /**
   * The parameters of the console link specified as part of the environment action.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.datazone.*;
   * AwsConsoleLinkParametersProperty awsConsoleLinkParametersProperty =
   * AwsConsoleLinkParametersProperty.builder()
   * .uri("uri")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environmentactions-awsconsolelinkparameters.html)
   */
  public interface AwsConsoleLinkParametersProperty {
    /**
     * The URI of the console link specified as part of the environment action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environmentactions-awsconsolelinkparameters.html#cfn-datazone-environmentactions-awsconsolelinkparameters-uri)
     */
    public fun uri(): String? = unwrap(this).getUri()

    /**
     * A builder for [AwsConsoleLinkParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param uri The URI of the console link specified as part of the environment action.
       */
      public fun uri(uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnEnvironmentActions.AwsConsoleLinkParametersProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnEnvironmentActions.AwsConsoleLinkParametersProperty.builder()

      /**
       * @param uri The URI of the console link specified as part of the environment action.
       */
      override fun uri(uri: String) {
        cdkBuilder.uri(uri)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnEnvironmentActions.AwsConsoleLinkParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentActions.AwsConsoleLinkParametersProperty,
    ) : CdkObject(cdkObject),
        AwsConsoleLinkParametersProperty {
      /**
       * The URI of the console link specified as part of the environment action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-environmentactions-awsconsolelinkparameters.html#cfn-datazone-environmentactions-awsconsolelinkparameters-uri)
       */
      override fun uri(): String? = unwrap(this).getUri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AwsConsoleLinkParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentActions.AwsConsoleLinkParametersProperty):
          AwsConsoleLinkParametersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AwsConsoleLinkParametersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsConsoleLinkParametersProperty):
          software.amazon.awscdk.services.datazone.CfnEnvironmentActions.AwsConsoleLinkParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.datazone.CfnEnvironmentActions.AwsConsoleLinkParametersProperty
    }
  }
}
