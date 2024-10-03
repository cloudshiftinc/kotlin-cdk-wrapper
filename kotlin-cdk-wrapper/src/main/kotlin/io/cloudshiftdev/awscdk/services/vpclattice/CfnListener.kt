@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a listener for a service.
 *
 * Before you start using your Amazon VPC Lattice service, you must add one or more listeners. A
 * listener is a process that checks for connection requests to your services. For more information,
 * see [Listeners](https://docs.aws.amazon.com/vpc-lattice/latest/ug/listeners.html) in the *Amazon VPC
 * Lattice User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.vpclattice.*;
 * CfnListener cfnListener = CfnListener.Builder.create(this, "MyCfnListener")
 * .defaultAction(DefaultActionProperty.builder()
 * .fixedResponse(FixedResponseProperty.builder()
 * .statusCode(123)
 * .build())
 * .forward(ForwardProperty.builder()
 * .targetGroups(List.of(WeightedTargetGroupProperty.builder()
 * .targetGroupIdentifier("targetGroupIdentifier")
 * // the properties below are optional
 * .weight(123)
 * .build()))
 * .build())
 * .build())
 * .protocol("protocol")
 * // the properties below are optional
 * .name("name")
 * .port(123)
 * .serviceIdentifier("serviceIdentifier")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html)
 */
public open class CfnListener(
  cdkObject: software.amazon.awscdk.services.vpclattice.CfnListener,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnListenerProps,
  ) :
      this(software.amazon.awscdk.services.vpclattice.CfnListener(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnListenerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnListenerProps.Builder.() -> Unit,
  ) : this(scope, id, CfnListenerProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the listener.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the listener.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The Amazon Resource Name (ARN) of the service.
   */
  public open fun attrServiceArn(): String = unwrap(this).getAttrServiceArn()

  /**
   * The ID of the service.
   */
  public open fun attrServiceId(): String = unwrap(this).getAttrServiceId()

  /**
   * The action for the default rule.
   */
  public open fun defaultAction(): Any = unwrap(this).getDefaultAction()

  /**
   * The action for the default rule.
   */
  public open fun defaultAction(`value`: IResolvable) {
    unwrap(this).setDefaultAction(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The action for the default rule.
   */
  public open fun defaultAction(`value`: DefaultActionProperty) {
    unwrap(this).setDefaultAction(`value`.let(DefaultActionProperty.Companion::unwrap))
  }

  /**
   * The action for the default rule.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1a0b9668628189a18f890d700f21508215ee5fb0d35467774673da807dd8f584")
  public open fun defaultAction(`value`: DefaultActionProperty.Builder.() -> Unit): Unit =
      defaultAction(DefaultActionProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the listener.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the listener.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The listener port.
   */
  public open fun port(): Number? = unwrap(this).getPort()

  /**
   * The listener port.
   */
  public open fun port(`value`: Number) {
    unwrap(this).setPort(`value`)
  }

  /**
   * The listener protocol.
   */
  public open fun protocol(): String = unwrap(this).getProtocol()

  /**
   * The listener protocol.
   */
  public open fun protocol(`value`: String) {
    unwrap(this).setProtocol(`value`)
  }

  /**
   * The ID or Amazon Resource Name (ARN) of the service.
   */
  public open fun serviceIdentifier(): String? = unwrap(this).getServiceIdentifier()

  /**
   * The ID or Amazon Resource Name (ARN) of the service.
   */
  public open fun serviceIdentifier(`value`: String) {
    unwrap(this).setServiceIdentifier(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags for the listener.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags for the listener.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags for the listener.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.vpclattice.CfnListener].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The action for the default rule.
     *
     * Each listener has a default rule. The default rule is used if no other rules match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-defaultaction)
     * @param defaultAction The action for the default rule. 
     */
    public fun defaultAction(defaultAction: IResolvable)

    /**
     * The action for the default rule.
     *
     * Each listener has a default rule. The default rule is used if no other rules match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-defaultaction)
     * @param defaultAction The action for the default rule. 
     */
    public fun defaultAction(defaultAction: DefaultActionProperty)

    /**
     * The action for the default rule.
     *
     * Each listener has a default rule. The default rule is used if no other rules match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-defaultaction)
     * @param defaultAction The action for the default rule. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33f9974638aaca0476dbf3be4f753ed548ae2ee3c024ba639f27f21ab1aadac1")
    public fun defaultAction(defaultAction: DefaultActionProperty.Builder.() -> Unit)

    /**
     * The name of the listener.
     *
     * A listener name must be unique within a service. The valid characters are a-z, 0-9, and
     * hyphens (-). You can't use a hyphen as the first or last character, or immediately after another
     * hyphen.
     *
     * If you don't specify a name, CloudFormation generates one. However, if you specify a name,
     * and later want to replace the resource, you must specify a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-name)
     * @param name The name of the listener. 
     */
    public fun name(name: String)

    /**
     * The listener port.
     *
     * You can specify a value from 1 to 65535. For HTTP, the default is 80. For HTTPS, the default
     * is 443.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-port)
     * @param port The listener port. 
     */
    public fun port(port: Number)

    /**
     * The listener protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-protocol)
     * @param protocol The listener protocol. 
     */
    public fun protocol(protocol: String)

    /**
     * The ID or Amazon Resource Name (ARN) of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-serviceidentifier)
     * @param serviceIdentifier The ID or Amazon Resource Name (ARN) of the service. 
     */
    public fun serviceIdentifier(serviceIdentifier: String)

    /**
     * The tags for the listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-tags)
     * @param tags The tags for the listener. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags for the listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-tags)
     * @param tags The tags for the listener. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.vpclattice.CfnListener.Builder =
        software.amazon.awscdk.services.vpclattice.CfnListener.Builder.create(scope, id)

    /**
     * The action for the default rule.
     *
     * Each listener has a default rule. The default rule is used if no other rules match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-defaultaction)
     * @param defaultAction The action for the default rule. 
     */
    override fun defaultAction(defaultAction: IResolvable) {
      cdkBuilder.defaultAction(defaultAction.let(IResolvable.Companion::unwrap))
    }

    /**
     * The action for the default rule.
     *
     * Each listener has a default rule. The default rule is used if no other rules match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-defaultaction)
     * @param defaultAction The action for the default rule. 
     */
    override fun defaultAction(defaultAction: DefaultActionProperty) {
      cdkBuilder.defaultAction(defaultAction.let(DefaultActionProperty.Companion::unwrap))
    }

    /**
     * The action for the default rule.
     *
     * Each listener has a default rule. The default rule is used if no other rules match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-defaultaction)
     * @param defaultAction The action for the default rule. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("33f9974638aaca0476dbf3be4f753ed548ae2ee3c024ba639f27f21ab1aadac1")
    override fun defaultAction(defaultAction: DefaultActionProperty.Builder.() -> Unit): Unit =
        defaultAction(DefaultActionProperty(defaultAction))

    /**
     * The name of the listener.
     *
     * A listener name must be unique within a service. The valid characters are a-z, 0-9, and
     * hyphens (-). You can't use a hyphen as the first or last character, or immediately after another
     * hyphen.
     *
     * If you don't specify a name, CloudFormation generates one. However, if you specify a name,
     * and later want to replace the resource, you must specify a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-name)
     * @param name The name of the listener. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The listener port.
     *
     * You can specify a value from 1 to 65535. For HTTP, the default is 80. For HTTPS, the default
     * is 443.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-port)
     * @param port The listener port. 
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * The listener protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-protocol)
     * @param protocol The listener protocol. 
     */
    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    /**
     * The ID or Amazon Resource Name (ARN) of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-serviceidentifier)
     * @param serviceIdentifier The ID or Amazon Resource Name (ARN) of the service. 
     */
    override fun serviceIdentifier(serviceIdentifier: String) {
      cdkBuilder.serviceIdentifier(serviceIdentifier)
    }

    /**
     * The tags for the listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-tags)
     * @param tags The tags for the listener. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags for the listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-listener.html#cfn-vpclattice-listener-tags)
     * @param tags The tags for the listener. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnListener = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.vpclattice.CfnListener.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnListener {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnListener(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnListener):
        CfnListener = CfnListener(cdkObject)

    internal fun unwrap(wrapped: CfnListener):
        software.amazon.awscdk.services.vpclattice.CfnListener = wrapped.cdkObject as
        software.amazon.awscdk.services.vpclattice.CfnListener
  }

  /**
   * The action for the default rule.
   *
   * Each listener has a default rule. The default rule is used if no other rules match.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.vpclattice.*;
   * DefaultActionProperty defaultActionProperty = DefaultActionProperty.builder()
   * .fixedResponse(FixedResponseProperty.builder()
   * .statusCode(123)
   * .build())
   * .forward(ForwardProperty.builder()
   * .targetGroups(List.of(WeightedTargetGroupProperty.builder()
   * .targetGroupIdentifier("targetGroupIdentifier")
   * // the properties below are optional
   * .weight(123)
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-listener-defaultaction.html)
   */
  public interface DefaultActionProperty {
    /**
     * Describes an action that returns a custom HTTP response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-listener-defaultaction.html#cfn-vpclattice-listener-defaultaction-fixedresponse)
     */
    public fun fixedResponse(): Any? = unwrap(this).getFixedResponse()

    /**
     * Describes a forward action.
     *
     * You can use forward actions to route requests to one or more target groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-listener-defaultaction.html#cfn-vpclattice-listener-defaultaction-forward)
     */
    public fun forward(): Any? = unwrap(this).getForward()

    /**
     * A builder for [DefaultActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fixedResponse Describes an action that returns a custom HTTP response.
       */
      public fun fixedResponse(fixedResponse: IResolvable)

      /**
       * @param fixedResponse Describes an action that returns a custom HTTP response.
       */
      public fun fixedResponse(fixedResponse: FixedResponseProperty)

      /**
       * @param fixedResponse Describes an action that returns a custom HTTP response.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4a3c9d278551eceb1d3b5e6deea7e01050cea016d10c69bda85c5b446a47bfd4")
      public fun fixedResponse(fixedResponse: FixedResponseProperty.Builder.() -> Unit)

      /**
       * @param forward Describes a forward action.
       * You can use forward actions to route requests to one or more target groups.
       */
      public fun forward(forward: IResolvable)

      /**
       * @param forward Describes a forward action.
       * You can use forward actions to route requests to one or more target groups.
       */
      public fun forward(forward: ForwardProperty)

      /**
       * @param forward Describes a forward action.
       * You can use forward actions to route requests to one or more target groups.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("692ec0d7935e4ac6fa2636c9d8edd0862e863336a5c647f4cdd8e16c4866fa47")
      public fun forward(forward: ForwardProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnListener.DefaultActionProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnListener.DefaultActionProperty.builder()

      /**
       * @param fixedResponse Describes an action that returns a custom HTTP response.
       */
      override fun fixedResponse(fixedResponse: IResolvable) {
        cdkBuilder.fixedResponse(fixedResponse.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param fixedResponse Describes an action that returns a custom HTTP response.
       */
      override fun fixedResponse(fixedResponse: FixedResponseProperty) {
        cdkBuilder.fixedResponse(fixedResponse.let(FixedResponseProperty.Companion::unwrap))
      }

      /**
       * @param fixedResponse Describes an action that returns a custom HTTP response.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4a3c9d278551eceb1d3b5e6deea7e01050cea016d10c69bda85c5b446a47bfd4")
      override fun fixedResponse(fixedResponse: FixedResponseProperty.Builder.() -> Unit): Unit =
          fixedResponse(FixedResponseProperty(fixedResponse))

      /**
       * @param forward Describes a forward action.
       * You can use forward actions to route requests to one or more target groups.
       */
      override fun forward(forward: IResolvable) {
        cdkBuilder.forward(forward.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param forward Describes a forward action.
       * You can use forward actions to route requests to one or more target groups.
       */
      override fun forward(forward: ForwardProperty) {
        cdkBuilder.forward(forward.let(ForwardProperty.Companion::unwrap))
      }

      /**
       * @param forward Describes a forward action.
       * You can use forward actions to route requests to one or more target groups.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("692ec0d7935e4ac6fa2636c9d8edd0862e863336a5c647f4cdd8e16c4866fa47")
      override fun forward(forward: ForwardProperty.Builder.() -> Unit): Unit =
          forward(ForwardProperty(forward))

      public fun build():
          software.amazon.awscdk.services.vpclattice.CfnListener.DefaultActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.vpclattice.CfnListener.DefaultActionProperty,
    ) : CdkObject(cdkObject),
        DefaultActionProperty {
      /**
       * Describes an action that returns a custom HTTP response.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-listener-defaultaction.html#cfn-vpclattice-listener-defaultaction-fixedresponse)
       */
      override fun fixedResponse(): Any? = unwrap(this).getFixedResponse()

      /**
       * Describes a forward action.
       *
       * You can use forward actions to route requests to one or more target groups.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-listener-defaultaction.html#cfn-vpclattice-listener-defaultaction-forward)
       */
      override fun forward(): Any? = unwrap(this).getForward()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DefaultActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnListener.DefaultActionProperty):
          DefaultActionProperty = CdkObjectWrappers.wrap(cdkObject) as? DefaultActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultActionProperty):
          software.amazon.awscdk.services.vpclattice.CfnListener.DefaultActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.vpclattice.CfnListener.DefaultActionProperty
    }
  }

  /**
   * Describes an action that returns a custom HTTP response.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.vpclattice.*;
   * FixedResponseProperty fixedResponseProperty = FixedResponseProperty.builder()
   * .statusCode(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-listener-fixedresponse.html)
   */
  public interface FixedResponseProperty {
    /**
     * The HTTP response code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-listener-fixedresponse.html#cfn-vpclattice-listener-fixedresponse-statuscode)
     */
    public fun statusCode(): Number

    /**
     * A builder for [FixedResponseProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param statusCode The HTTP response code. 
       */
      public fun statusCode(statusCode: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnListener.FixedResponseProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnListener.FixedResponseProperty.builder()

      /**
       * @param statusCode The HTTP response code. 
       */
      override fun statusCode(statusCode: Number) {
        cdkBuilder.statusCode(statusCode)
      }

      public fun build():
          software.amazon.awscdk.services.vpclattice.CfnListener.FixedResponseProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.vpclattice.CfnListener.FixedResponseProperty,
    ) : CdkObject(cdkObject),
        FixedResponseProperty {
      /**
       * The HTTP response code.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-listener-fixedresponse.html#cfn-vpclattice-listener-fixedresponse-statuscode)
       */
      override fun statusCode(): Number = unwrap(this).getStatusCode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FixedResponseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnListener.FixedResponseProperty):
          FixedResponseProperty = CdkObjectWrappers.wrap(cdkObject) as? FixedResponseProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FixedResponseProperty):
          software.amazon.awscdk.services.vpclattice.CfnListener.FixedResponseProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.vpclattice.CfnListener.FixedResponseProperty
    }
  }

  /**
   * The forward action.
   *
   * Traffic that matches the rule is forwarded to the specified target groups.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.vpclattice.*;
   * ForwardProperty forwardProperty = ForwardProperty.builder()
   * .targetGroups(List.of(WeightedTargetGroupProperty.builder()
   * .targetGroupIdentifier("targetGroupIdentifier")
   * // the properties below are optional
   * .weight(123)
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-listener-forward.html)
   */
  public interface ForwardProperty {
    /**
     * The target groups.
     *
     * Traffic matching the rule is forwarded to the specified target groups. With forward actions,
     * you can assign a weight that controls the prioritization and selection of each target group.
     * This means that requests are distributed to individual target groups based on their weights. For
     * example, if two target groups have the same weight, each target group receives half of the
     * traffic.
     *
     * The default value is 1. This means that if only one target group is provided, there is no
     * need to set the weight; 100% of the traffic goes to that target group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-listener-forward.html#cfn-vpclattice-listener-forward-targetgroups)
     */
    public fun targetGroups(): Any

    /**
     * A builder for [ForwardProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param targetGroups The target groups. 
       * Traffic matching the rule is forwarded to the specified target groups. With forward
       * actions, you can assign a weight that controls the prioritization and selection of each target
       * group. This means that requests are distributed to individual target groups based on their
       * weights. For example, if two target groups have the same weight, each target group receives
       * half of the traffic.
       *
       * The default value is 1. This means that if only one target group is provided, there is no
       * need to set the weight; 100% of the traffic goes to that target group.
       */
      public fun targetGroups(targetGroups: IResolvable)

      /**
       * @param targetGroups The target groups. 
       * Traffic matching the rule is forwarded to the specified target groups. With forward
       * actions, you can assign a weight that controls the prioritization and selection of each target
       * group. This means that requests are distributed to individual target groups based on their
       * weights. For example, if two target groups have the same weight, each target group receives
       * half of the traffic.
       *
       * The default value is 1. This means that if only one target group is provided, there is no
       * need to set the weight; 100% of the traffic goes to that target group.
       */
      public fun targetGroups(targetGroups: List<Any>)

      /**
       * @param targetGroups The target groups. 
       * Traffic matching the rule is forwarded to the specified target groups. With forward
       * actions, you can assign a weight that controls the prioritization and selection of each target
       * group. This means that requests are distributed to individual target groups based on their
       * weights. For example, if two target groups have the same weight, each target group receives
       * half of the traffic.
       *
       * The default value is 1. This means that if only one target group is provided, there is no
       * need to set the weight; 100% of the traffic goes to that target group.
       */
      public fun targetGroups(vararg targetGroups: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnListener.ForwardProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnListener.ForwardProperty.builder()

      /**
       * @param targetGroups The target groups. 
       * Traffic matching the rule is forwarded to the specified target groups. With forward
       * actions, you can assign a weight that controls the prioritization and selection of each target
       * group. This means that requests are distributed to individual target groups based on their
       * weights. For example, if two target groups have the same weight, each target group receives
       * half of the traffic.
       *
       * The default value is 1. This means that if only one target group is provided, there is no
       * need to set the weight; 100% of the traffic goes to that target group.
       */
      override fun targetGroups(targetGroups: IResolvable) {
        cdkBuilder.targetGroups(targetGroups.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param targetGroups The target groups. 
       * Traffic matching the rule is forwarded to the specified target groups. With forward
       * actions, you can assign a weight that controls the prioritization and selection of each target
       * group. This means that requests are distributed to individual target groups based on their
       * weights. For example, if two target groups have the same weight, each target group receives
       * half of the traffic.
       *
       * The default value is 1. This means that if only one target group is provided, there is no
       * need to set the weight; 100% of the traffic goes to that target group.
       */
      override fun targetGroups(targetGroups: List<Any>) {
        cdkBuilder.targetGroups(targetGroups.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param targetGroups The target groups. 
       * Traffic matching the rule is forwarded to the specified target groups. With forward
       * actions, you can assign a weight that controls the prioritization and selection of each target
       * group. This means that requests are distributed to individual target groups based on their
       * weights. For example, if two target groups have the same weight, each target group receives
       * half of the traffic.
       *
       * The default value is 1. This means that if only one target group is provided, there is no
       * need to set the weight; 100% of the traffic goes to that target group.
       */
      override fun targetGroups(vararg targetGroups: Any): Unit =
          targetGroups(targetGroups.toList())

      public fun build(): software.amazon.awscdk.services.vpclattice.CfnListener.ForwardProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.vpclattice.CfnListener.ForwardProperty,
    ) : CdkObject(cdkObject),
        ForwardProperty {
      /**
       * The target groups.
       *
       * Traffic matching the rule is forwarded to the specified target groups. With forward
       * actions, you can assign a weight that controls the prioritization and selection of each target
       * group. This means that requests are distributed to individual target groups based on their
       * weights. For example, if two target groups have the same weight, each target group receives
       * half of the traffic.
       *
       * The default value is 1. This means that if only one target group is provided, there is no
       * need to set the weight; 100% of the traffic goes to that target group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-listener-forward.html#cfn-vpclattice-listener-forward-targetgroups)
       */
      override fun targetGroups(): Any = unwrap(this).getTargetGroups()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ForwardProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnListener.ForwardProperty):
          ForwardProperty = CdkObjectWrappers.wrap(cdkObject) as? ForwardProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ForwardProperty):
          software.amazon.awscdk.services.vpclattice.CfnListener.ForwardProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.vpclattice.CfnListener.ForwardProperty
    }
  }

  /**
   * Describes the weight of a target group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.vpclattice.*;
   * WeightedTargetGroupProperty weightedTargetGroupProperty = WeightedTargetGroupProperty.builder()
   * .targetGroupIdentifier("targetGroupIdentifier")
   * // the properties below are optional
   * .weight(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-listener-weightedtargetgroup.html)
   */
  public interface WeightedTargetGroupProperty {
    /**
     * The ID of the target group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-listener-weightedtargetgroup.html#cfn-vpclattice-listener-weightedtargetgroup-targetgroupidentifier)
     */
    public fun targetGroupIdentifier(): String

    /**
     * Only required if you specify multiple target groups for a forward action.
     *
     * The weight determines how requests are distributed to the target group. For example, if you
     * specify two target groups, each with a weight of 10, each target group receives half the
     * requests. If you specify two target groups, one with a weight of 10 and the other with a weight
     * of 20, the target group with a weight of 20 receives twice as many requests as the other target
     * group. If there's only one target group specified, then the default value is 100.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-listener-weightedtargetgroup.html#cfn-vpclattice-listener-weightedtargetgroup-weight)
     */
    public fun weight(): Number? = unwrap(this).getWeight()

    /**
     * A builder for [WeightedTargetGroupProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param targetGroupIdentifier The ID of the target group. 
       */
      public fun targetGroupIdentifier(targetGroupIdentifier: String)

      /**
       * @param weight Only required if you specify multiple target groups for a forward action.
       * The weight determines how requests are distributed to the target group. For example, if you
       * specify two target groups, each with a weight of 10, each target group receives half the
       * requests. If you specify two target groups, one with a weight of 10 and the other with a
       * weight of 20, the target group with a weight of 20 receives twice as many requests as the
       * other target group. If there's only one target group specified, then the default value is 100.
       */
      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnListener.WeightedTargetGroupProperty.Builder
          =
          software.amazon.awscdk.services.vpclattice.CfnListener.WeightedTargetGroupProperty.builder()

      /**
       * @param targetGroupIdentifier The ID of the target group. 
       */
      override fun targetGroupIdentifier(targetGroupIdentifier: String) {
        cdkBuilder.targetGroupIdentifier(targetGroupIdentifier)
      }

      /**
       * @param weight Only required if you specify multiple target groups for a forward action.
       * The weight determines how requests are distributed to the target group. For example, if you
       * specify two target groups, each with a weight of 10, each target group receives half the
       * requests. If you specify two target groups, one with a weight of 10 and the other with a
       * weight of 20, the target group with a weight of 20 receives twice as many requests as the
       * other target group. If there's only one target group specified, then the default value is 100.
       */
      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.vpclattice.CfnListener.WeightedTargetGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.vpclattice.CfnListener.WeightedTargetGroupProperty,
    ) : CdkObject(cdkObject),
        WeightedTargetGroupProperty {
      /**
       * The ID of the target group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-listener-weightedtargetgroup.html#cfn-vpclattice-listener-weightedtargetgroup-targetgroupidentifier)
       */
      override fun targetGroupIdentifier(): String = unwrap(this).getTargetGroupIdentifier()

      /**
       * Only required if you specify multiple target groups for a forward action.
       *
       * The weight determines how requests are distributed to the target group. For example, if you
       * specify two target groups, each with a weight of 10, each target group receives half the
       * requests. If you specify two target groups, one with a weight of 10 and the other with a
       * weight of 20, the target group with a weight of 20 receives twice as many requests as the
       * other target group. If there's only one target group specified, then the default value is 100.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-listener-weightedtargetgroup.html#cfn-vpclattice-listener-weightedtargetgroup-weight)
       */
      override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WeightedTargetGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnListener.WeightedTargetGroupProperty):
          WeightedTargetGroupProperty = CdkObjectWrappers.wrap(cdkObject) as?
          WeightedTargetGroupProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: WeightedTargetGroupProperty):
          software.amazon.awscdk.services.vpclattice.CfnListener.WeightedTargetGroupProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.vpclattice.CfnListener.WeightedTargetGroupProperty
    }
  }
}
