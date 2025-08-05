@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::GameLift::Alias` resource creates an alias for an Amazon GameLift (GameLift) fleet
 * destination.
 *
 * There are two types of routing strategies for aliases: simple and terminal. A simple alias points
 * to an active fleet. A terminal alias displays a message instead of routing players to an active
 * fleet. For example, a terminal alias might display a URL link that directs players to an upgrade
 * site. You can use aliases to define destinations in a game session queue or when requesting new game
 * sessions.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.gamelift.*;
 * CfnAlias cfnAlias = CfnAlias.Builder.create(this, "MyCfnAlias")
 * .name("name")
 * .routingStrategy(RoutingStrategyProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .fleetId("fleetId")
 * .message("message")
 * .build())
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html)
 */
public open class CfnAlias(
  cdkObject: software.amazon.awscdk.services.gamelift.CfnAlias,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAliasProps,
  ) :
      this(software.amazon.awscdk.services.gamelift.CfnAlias(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAliasProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAliasProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAliasProps(props)
  )

  /**
   * The Amazon Resource Name (
   * [ARN](https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html) ) that is assigned to a
   * Amazon GameLift Servers alias resource and uniquely identifies it. ARNs are unique across all
   * Regions. Format is
   * `arn:aws:gamelift:&lt;region&gt;::alias/alias-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912` . In a
   * GameLift alias ARN, the resource ID matches the alias ID value.
   */
  public open fun attrAliasArn(): String = unwrap(this).getAttrAliasArn()

  /**
   * A unique identifier for the alias. For example,
   * `arn:aws:gamelift:us-west-1::alias/alias-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912`.
   *
   * Alias IDs are unique within a Region.
   */
  public open fun attrAliasId(): String = unwrap(this).getAttrAliasId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A human-readable description of the alias.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A human-readable description of the alias.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   * A descriptive label that is associated with an alias.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A descriptive label that is associated with an alias.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The routing configuration, including routing type and fleet target, for the alias.
   */
  public open fun routingStrategy(): Any = unwrap(this).getRoutingStrategy()

  /**
   * The routing configuration, including routing type and fleet target, for the alias.
   */
  public open fun routingStrategy(`value`: IResolvable) {
    unwrap(this).setRoutingStrategy(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The routing configuration, including routing type and fleet target, for the alias.
   */
  public open fun routingStrategy(`value`: RoutingStrategyProperty) {
    unwrap(this).setRoutingStrategy(`value`.let(RoutingStrategyProperty.Companion::unwrap))
  }

  /**
   * The routing configuration, including routing type and fleet target, for the alias.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e386ccad993278a593306b65466fd22101590cb3f712a6640ada5b01ad566510")
  public open fun routingStrategy(`value`: RoutingStrategyProperty.Builder.() -> Unit): Unit =
      routingStrategy(RoutingStrategyProperty(`value`))

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.gamelift.CfnAlias].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A human-readable description of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-description)
     * @param description A human-readable description of the alias. 
     */
    public fun description(description: String)

    /**
     * A descriptive label that is associated with an alias.
     *
     * Alias names do not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-name)
     * @param name A descriptive label that is associated with an alias. 
     */
    public fun name(name: String)

    /**
     * The routing configuration, including routing type and fleet target, for the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-routingstrategy)
     * @param routingStrategy The routing configuration, including routing type and fleet target,
     * for the alias. 
     */
    public fun routingStrategy(routingStrategy: IResolvable)

    /**
     * The routing configuration, including routing type and fleet target, for the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-routingstrategy)
     * @param routingStrategy The routing configuration, including routing type and fleet target,
     * for the alias. 
     */
    public fun routingStrategy(routingStrategy: RoutingStrategyProperty)

    /**
     * The routing configuration, including routing type and fleet target, for the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-routingstrategy)
     * @param routingStrategy The routing configuration, including routing type and fleet target,
     * for the alias. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48db2f8128a66631467a218444363fbda68842721f78cbfaf41860c50d6f2b2b")
    public fun routingStrategy(routingStrategy: RoutingStrategyProperty.Builder.() -> Unit)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.gamelift.CfnAlias.Builder =
        software.amazon.awscdk.services.gamelift.CfnAlias.Builder.create(scope, id)

    /**
     * A human-readable description of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-description)
     * @param description A human-readable description of the alias. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * A descriptive label that is associated with an alias.
     *
     * Alias names do not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-name)
     * @param name A descriptive label that is associated with an alias. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The routing configuration, including routing type and fleet target, for the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-routingstrategy)
     * @param routingStrategy The routing configuration, including routing type and fleet target,
     * for the alias. 
     */
    override fun routingStrategy(routingStrategy: IResolvable) {
      cdkBuilder.routingStrategy(routingStrategy.let(IResolvable.Companion::unwrap))
    }

    /**
     * The routing configuration, including routing type and fleet target, for the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-routingstrategy)
     * @param routingStrategy The routing configuration, including routing type and fleet target,
     * for the alias. 
     */
    override fun routingStrategy(routingStrategy: RoutingStrategyProperty) {
      cdkBuilder.routingStrategy(routingStrategy.let(RoutingStrategyProperty.Companion::unwrap))
    }

    /**
     * The routing configuration, including routing type and fleet target, for the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-routingstrategy)
     * @param routingStrategy The routing configuration, including routing type and fleet target,
     * for the alias. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48db2f8128a66631467a218444363fbda68842721f78cbfaf41860c50d6f2b2b")
    override fun routingStrategy(routingStrategy: RoutingStrategyProperty.Builder.() -> Unit): Unit
        = routingStrategy(RoutingStrategyProperty(routingStrategy))

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.gamelift.CfnAlias = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.gamelift.CfnAlias.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAlias {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAlias(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnAlias): CfnAlias =
        CfnAlias(cdkObject)

    internal fun unwrap(wrapped: CfnAlias): software.amazon.awscdk.services.gamelift.CfnAlias =
        wrapped.cdkObject as software.amazon.awscdk.services.gamelift.CfnAlias
  }

  /**
   * The routing configuration for a fleet alias.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.gamelift.*;
   * RoutingStrategyProperty routingStrategyProperty = RoutingStrategyProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .fleetId("fleetId")
   * .message("message")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-alias-routingstrategy.html)
   */
  public interface RoutingStrategyProperty {
    /**
     * A unique identifier for a fleet that the alias points to.
     *
     * If you specify `SIMPLE` for the `Type` property, you must specify this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-alias-routingstrategy.html#cfn-gamelift-alias-routingstrategy-fleetid)
     */
    public fun fleetId(): String? = unwrap(this).getFleetId()

    /**
     * The message text to be used with a terminal routing strategy.
     *
     * If you specify `TERMINAL` for the `Type` property, you must specify this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-alias-routingstrategy.html#cfn-gamelift-alias-routingstrategy-message)
     */
    public fun message(): String? = unwrap(this).getMessage()

    /**
     * A type of routing strategy.
     *
     * Possible routing types include the following:
     *
     * * *SIMPLE* - The alias resolves to one specific fleet. Use this type when routing to active
     * fleets.
     * * *TERMINAL* - The alias does not resolve to a fleet but instead can be used to display a
     * message to the user. A terminal alias throws a `TerminalRoutingStrategyException` with the
     * message that you specified in the `Message` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-alias-routingstrategy.html#cfn-gamelift-alias-routingstrategy-type)
     */
    public fun type(): String

    /**
     * A builder for [RoutingStrategyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fleetId A unique identifier for a fleet that the alias points to.
       * If you specify `SIMPLE` for the `Type` property, you must specify this property.
       */
      public fun fleetId(fleetId: String)

      /**
       * @param message The message text to be used with a terminal routing strategy.
       * If you specify `TERMINAL` for the `Type` property, you must specify this property.
       */
      public fun message(message: String)

      /**
       * @param type A type of routing strategy. 
       * Possible routing types include the following:
       *
       * * *SIMPLE* - The alias resolves to one specific fleet. Use this type when routing to active
       * fleets.
       * * *TERMINAL* - The alias does not resolve to a fleet but instead can be used to display a
       * message to the user. A terminal alias throws a `TerminalRoutingStrategyException` with the
       * message that you specified in the `Message` property.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty.Builder =
          software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty.builder()

      /**
       * @param fleetId A unique identifier for a fleet that the alias points to.
       * If you specify `SIMPLE` for the `Type` property, you must specify this property.
       */
      override fun fleetId(fleetId: String) {
        cdkBuilder.fleetId(fleetId)
      }

      /**
       * @param message The message text to be used with a terminal routing strategy.
       * If you specify `TERMINAL` for the `Type` property, you must specify this property.
       */
      override fun message(message: String) {
        cdkBuilder.message(message)
      }

      /**
       * @param type A type of routing strategy. 
       * Possible routing types include the following:
       *
       * * *SIMPLE* - The alias resolves to one specific fleet. Use this type when routing to active
       * fleets.
       * * *TERMINAL* - The alias does not resolve to a fleet but instead can be used to display a
       * message to the user. A terminal alias throws a `TerminalRoutingStrategyException` with the
       * message that you specified in the `Message` property.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty,
    ) : CdkObject(cdkObject),
        RoutingStrategyProperty {
      /**
       * A unique identifier for a fleet that the alias points to.
       *
       * If you specify `SIMPLE` for the `Type` property, you must specify this property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-alias-routingstrategy.html#cfn-gamelift-alias-routingstrategy-fleetid)
       */
      override fun fleetId(): String? = unwrap(this).getFleetId()

      /**
       * The message text to be used with a terminal routing strategy.
       *
       * If you specify `TERMINAL` for the `Type` property, you must specify this property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-alias-routingstrategy.html#cfn-gamelift-alias-routingstrategy-message)
       */
      override fun message(): String? = unwrap(this).getMessage()

      /**
       * A type of routing strategy.
       *
       * Possible routing types include the following:
       *
       * * *SIMPLE* - The alias resolves to one specific fleet. Use this type when routing to active
       * fleets.
       * * *TERMINAL* - The alias does not resolve to a fleet but instead can be used to display a
       * message to the user. A terminal alias throws a `TerminalRoutingStrategyException` with the
       * message that you specified in the `Message` property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-alias-routingstrategy.html#cfn-gamelift-alias-routingstrategy-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RoutingStrategyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty):
          RoutingStrategyProperty = CdkObjectWrappers.wrap(cdkObject) as? RoutingStrategyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RoutingStrategyProperty):
          software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty
    }
  }
}
