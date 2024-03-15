@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Describes a Network Access Scope.
 *
 * A Network Access Scope defines outbound (egress) and inbound (ingress) traffic patterns,
 * including sources, destinations, paths, and traffic types.
 *
 * Network Access Analyzer identifies unintended network access to your resources on AWS . When you
 * start an analysis on a Network Access Scope, Network Access Analyzer produces findings. For more
 * information, see the [Network Access Analyzer User
 * Guide](https://docs.aws.amazon.com/vpc/latest/network-access-analyzer/) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnNetworkInsightsAccessScope cfnNetworkInsightsAccessScope =
 * CfnNetworkInsightsAccessScope.Builder.create(this, "MyCfnNetworkInsightsAccessScope")
 * .excludePaths(List.of(AccessScopePathRequestProperty.builder()
 * .destination(PathStatementRequestProperty.builder()
 * .packetHeaderStatement(PacketHeaderStatementRequestProperty.builder()
 * .destinationAddresses(List.of("destinationAddresses"))
 * .destinationPorts(List.of("destinationPorts"))
 * .destinationPrefixLists(List.of("destinationPrefixLists"))
 * .protocols(List.of("protocols"))
 * .sourceAddresses(List.of("sourceAddresses"))
 * .sourcePorts(List.of("sourcePorts"))
 * .sourcePrefixLists(List.of("sourcePrefixLists"))
 * .build())
 * .resourceStatement(ResourceStatementRequestProperty.builder()
 * .resources(List.of("resources"))
 * .resourceTypes(List.of("resourceTypes"))
 * .build())
 * .build())
 * .source(PathStatementRequestProperty.builder()
 * .packetHeaderStatement(PacketHeaderStatementRequestProperty.builder()
 * .destinationAddresses(List.of("destinationAddresses"))
 * .destinationPorts(List.of("destinationPorts"))
 * .destinationPrefixLists(List.of("destinationPrefixLists"))
 * .protocols(List.of("protocols"))
 * .sourceAddresses(List.of("sourceAddresses"))
 * .sourcePorts(List.of("sourcePorts"))
 * .sourcePrefixLists(List.of("sourcePrefixLists"))
 * .build())
 * .resourceStatement(ResourceStatementRequestProperty.builder()
 * .resources(List.of("resources"))
 * .resourceTypes(List.of("resourceTypes"))
 * .build())
 * .build())
 * .throughResources(List.of(ThroughResourcesStatementRequestProperty.builder()
 * .resourceStatement(ResourceStatementRequestProperty.builder()
 * .resources(List.of("resources"))
 * .resourceTypes(List.of("resourceTypes"))
 * .build())
 * .build()))
 * .build()))
 * .matchPaths(List.of(AccessScopePathRequestProperty.builder()
 * .destination(PathStatementRequestProperty.builder()
 * .packetHeaderStatement(PacketHeaderStatementRequestProperty.builder()
 * .destinationAddresses(List.of("destinationAddresses"))
 * .destinationPorts(List.of("destinationPorts"))
 * .destinationPrefixLists(List.of("destinationPrefixLists"))
 * .protocols(List.of("protocols"))
 * .sourceAddresses(List.of("sourceAddresses"))
 * .sourcePorts(List.of("sourcePorts"))
 * .sourcePrefixLists(List.of("sourcePrefixLists"))
 * .build())
 * .resourceStatement(ResourceStatementRequestProperty.builder()
 * .resources(List.of("resources"))
 * .resourceTypes(List.of("resourceTypes"))
 * .build())
 * .build())
 * .source(PathStatementRequestProperty.builder()
 * .packetHeaderStatement(PacketHeaderStatementRequestProperty.builder()
 * .destinationAddresses(List.of("destinationAddresses"))
 * .destinationPorts(List.of("destinationPorts"))
 * .destinationPrefixLists(List.of("destinationPrefixLists"))
 * .protocols(List.of("protocols"))
 * .sourceAddresses(List.of("sourceAddresses"))
 * .sourcePorts(List.of("sourcePorts"))
 * .sourcePrefixLists(List.of("sourcePrefixLists"))
 * .build())
 * .resourceStatement(ResourceStatementRequestProperty.builder()
 * .resources(List.of("resources"))
 * .resourceTypes(List.of("resourceTypes"))
 * .build())
 * .build())
 * .throughResources(List.of(ThroughResourcesStatementRequestProperty.builder()
 * .resourceStatement(ResourceStatementRequestProperty.builder()
 * .resources(List.of("resources"))
 * .resourceTypes(List.of("resourceTypes"))
 * .build())
 * .build()))
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html)
 */
public open class CfnNetworkInsightsAccessScope internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The creation date.
   */
  public open fun attrCreatedDate(): String = unwrap(this).getAttrCreatedDate()

  /**
   * The ARN of the Network Access Scope.
   */
  public open fun attrNetworkInsightsAccessScopeArn(): String =
      unwrap(this).getAttrNetworkInsightsAccessScopeArn()

  /**
   * The ID of the Network Access Scope.
   */
  public open fun attrNetworkInsightsAccessScopeId(): String =
      unwrap(this).getAttrNetworkInsightsAccessScopeId()

  /**
   * The last updated date.
   */
  public open fun attrUpdatedDate(): String = unwrap(this).getAttrUpdatedDate()

  /**
   * The paths to exclude.
   */
  public open fun excludePaths(): Any? = unwrap(this).getExcludePaths()

  /**
   * The paths to exclude.
   */
  public open fun excludePaths(`value`: IResolvable) {
    unwrap(this).setExcludePaths(`value`.let(IResolvable::unwrap))
  }

  /**
   * The paths to exclude.
   */
  public open fun excludePaths(`value`: List<Any>) {
    unwrap(this).setExcludePaths(`value`)
  }

  /**
   * The paths to exclude.
   */
  public open fun excludePaths(vararg `value`: Any): Unit = excludePaths(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The paths to match.
   */
  public open fun matchPaths(): Any? = unwrap(this).getMatchPaths()

  /**
   * The paths to match.
   */
  public open fun matchPaths(`value`: IResolvable) {
    unwrap(this).setMatchPaths(`value`.let(IResolvable::unwrap))
  }

  /**
   * The paths to match.
   */
  public open fun matchPaths(`value`: List<Any>) {
    unwrap(this).setMatchPaths(`value`)
  }

  /**
   * The paths to match.
   */
  public open fun matchPaths(vararg `value`: Any): Unit = matchPaths(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnNetworkInsightsAccessScope].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The paths to exclude.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-excludepaths)
     * @param excludePaths The paths to exclude. 
     */
    public fun excludePaths(excludePaths: IResolvable)

    /**
     * The paths to exclude.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-excludepaths)
     * @param excludePaths The paths to exclude. 
     */
    public fun excludePaths(excludePaths: List<Any>)

    /**
     * The paths to exclude.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-excludepaths)
     * @param excludePaths The paths to exclude. 
     */
    public fun excludePaths(vararg excludePaths: Any)

    /**
     * The paths to match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-matchpaths)
     * @param matchPaths The paths to match. 
     */
    public fun matchPaths(matchPaths: IResolvable)

    /**
     * The paths to match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-matchpaths)
     * @param matchPaths The paths to match. 
     */
    public fun matchPaths(matchPaths: List<Any>)

    /**
     * The paths to match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-matchpaths)
     * @param matchPaths The paths to match. 
     */
    public fun matchPaths(vararg matchPaths: Any)

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-tags)
     * @param tags The tags. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-tags)
     * @param tags The tags. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.Builder.create(scope, id)

    /**
     * The paths to exclude.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-excludepaths)
     * @param excludePaths The paths to exclude. 
     */
    override fun excludePaths(excludePaths: IResolvable) {
      cdkBuilder.excludePaths(excludePaths.let(IResolvable::unwrap))
    }

    /**
     * The paths to exclude.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-excludepaths)
     * @param excludePaths The paths to exclude. 
     */
    override fun excludePaths(excludePaths: List<Any>) {
      cdkBuilder.excludePaths(excludePaths)
    }

    /**
     * The paths to exclude.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-excludepaths)
     * @param excludePaths The paths to exclude. 
     */
    override fun excludePaths(vararg excludePaths: Any): Unit = excludePaths(excludePaths.toList())

    /**
     * The paths to match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-matchpaths)
     * @param matchPaths The paths to match. 
     */
    override fun matchPaths(matchPaths: IResolvable) {
      cdkBuilder.matchPaths(matchPaths.let(IResolvable::unwrap))
    }

    /**
     * The paths to match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-matchpaths)
     * @param matchPaths The paths to match. 
     */
    override fun matchPaths(matchPaths: List<Any>) {
      cdkBuilder.matchPaths(matchPaths)
    }

    /**
     * The paths to match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-matchpaths)
     * @param matchPaths The paths to match. 
     */
    override fun matchPaths(vararg matchPaths: Any): Unit = matchPaths(matchPaths.toList())

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-tags)
     * @param tags The tags. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinsightsaccessscope.html#cfn-ec2-networkinsightsaccessscope-tags)
     * @param tags The tags. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNetworkInsightsAccessScope {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNetworkInsightsAccessScope(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope):
        CfnNetworkInsightsAccessScope = CfnNetworkInsightsAccessScope(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkInsightsAccessScope):
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope = wrapped.cdkObject
  }

  /**
   * Describes a through resource statement.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * ThroughResourcesStatementRequestProperty throughResourcesStatementRequestProperty =
   * ThroughResourcesStatementRequestProperty.builder()
   * .resourceStatement(ResourceStatementRequestProperty.builder()
   * .resources(List.of("resources"))
   * .resourceTypes(List.of("resourceTypes"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-throughresourcesstatementrequest.html)
   */
  public interface ThroughResourcesStatementRequestProperty {
    /**
     * The resource statement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-throughresourcesstatementrequest.html#cfn-ec2-networkinsightsaccessscope-throughresourcesstatementrequest-resourcestatement)
     */
    public fun resourceStatement(): Any? = unwrap(this).getResourceStatement()

    /**
     * A builder for [ThroughResourcesStatementRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceStatement The resource statement.
       */
      public fun resourceStatement(resourceStatement: IResolvable)

      /**
       * @param resourceStatement The resource statement.
       */
      public fun resourceStatement(resourceStatement: ResourceStatementRequestProperty)

      /**
       * @param resourceStatement The resource statement.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("423458459363e0c9215239e6647bed7b703cd31ede23af357cb017e6a3612e13")
      public
          fun resourceStatement(resourceStatement: ResourceStatementRequestProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.ThroughResourcesStatementRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.ThroughResourcesStatementRequestProperty.builder()

      /**
       * @param resourceStatement The resource statement.
       */
      override fun resourceStatement(resourceStatement: IResolvable) {
        cdkBuilder.resourceStatement(resourceStatement.let(IResolvable::unwrap))
      }

      /**
       * @param resourceStatement The resource statement.
       */
      override fun resourceStatement(resourceStatement: ResourceStatementRequestProperty) {
        cdkBuilder.resourceStatement(resourceStatement.let(ResourceStatementRequestProperty::unwrap))
      }

      /**
       * @param resourceStatement The resource statement.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("423458459363e0c9215239e6647bed7b703cd31ede23af357cb017e6a3612e13")
      override
          fun resourceStatement(resourceStatement: ResourceStatementRequestProperty.Builder.() -> Unit):
          Unit = resourceStatement(ResourceStatementRequestProperty(resourceStatement))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.ThroughResourcesStatementRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.ThroughResourcesStatementRequestProperty,
    ) : CdkObject(cdkObject), ThroughResourcesStatementRequestProperty {
      /**
       * The resource statement.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-throughresourcesstatementrequest.html#cfn-ec2-networkinsightsaccessscope-throughresourcesstatementrequest-resourcestatement)
       */
      override fun resourceStatement(): Any? = unwrap(this).getResourceStatement()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ThroughResourcesStatementRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.ThroughResourcesStatementRequestProperty):
          ThroughResourcesStatementRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThroughResourcesStatementRequestProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.ThroughResourcesStatementRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.ThroughResourcesStatementRequestProperty
    }
  }

  /**
   * Describes a path statement.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * PathStatementRequestProperty pathStatementRequestProperty =
   * PathStatementRequestProperty.builder()
   * .packetHeaderStatement(PacketHeaderStatementRequestProperty.builder()
   * .destinationAddresses(List.of("destinationAddresses"))
   * .destinationPorts(List.of("destinationPorts"))
   * .destinationPrefixLists(List.of("destinationPrefixLists"))
   * .protocols(List.of("protocols"))
   * .sourceAddresses(List.of("sourceAddresses"))
   * .sourcePorts(List.of("sourcePorts"))
   * .sourcePrefixLists(List.of("sourcePrefixLists"))
   * .build())
   * .resourceStatement(ResourceStatementRequestProperty.builder()
   * .resources(List.of("resources"))
   * .resourceTypes(List.of("resourceTypes"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-pathstatementrequest.html)
   */
  public interface PathStatementRequestProperty {
    /**
     * The packet header statement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-pathstatementrequest.html#cfn-ec2-networkinsightsaccessscope-pathstatementrequest-packetheaderstatement)
     */
    public fun packetHeaderStatement(): Any? = unwrap(this).getPacketHeaderStatement()

    /**
     * The resource statement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-pathstatementrequest.html#cfn-ec2-networkinsightsaccessscope-pathstatementrequest-resourcestatement)
     */
    public fun resourceStatement(): Any? = unwrap(this).getResourceStatement()

    /**
     * A builder for [PathStatementRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param packetHeaderStatement The packet header statement.
       */
      public fun packetHeaderStatement(packetHeaderStatement: IResolvable)

      /**
       * @param packetHeaderStatement The packet header statement.
       */
      public fun packetHeaderStatement(packetHeaderStatement: PacketHeaderStatementRequestProperty)

      /**
       * @param packetHeaderStatement The packet header statement.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79ded352caa18d864b60f9392e8f63faa86842009ead626b6f9b9eee09a20597")
      public
          fun packetHeaderStatement(packetHeaderStatement: PacketHeaderStatementRequestProperty.Builder.() -> Unit)

      /**
       * @param resourceStatement The resource statement.
       */
      public fun resourceStatement(resourceStatement: IResolvable)

      /**
       * @param resourceStatement The resource statement.
       */
      public fun resourceStatement(resourceStatement: ResourceStatementRequestProperty)

      /**
       * @param resourceStatement The resource statement.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("94af38a3de4afaaf2a082829aef56c9b0e4eed32792656b36dc3cfb773f06d10")
      public
          fun resourceStatement(resourceStatement: ResourceStatementRequestProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.PathStatementRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.PathStatementRequestProperty.builder()

      /**
       * @param packetHeaderStatement The packet header statement.
       */
      override fun packetHeaderStatement(packetHeaderStatement: IResolvable) {
        cdkBuilder.packetHeaderStatement(packetHeaderStatement.let(IResolvable::unwrap))
      }

      /**
       * @param packetHeaderStatement The packet header statement.
       */
      override
          fun packetHeaderStatement(packetHeaderStatement: PacketHeaderStatementRequestProperty) {
        cdkBuilder.packetHeaderStatement(packetHeaderStatement.let(PacketHeaderStatementRequestProperty::unwrap))
      }

      /**
       * @param packetHeaderStatement The packet header statement.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79ded352caa18d864b60f9392e8f63faa86842009ead626b6f9b9eee09a20597")
      override
          fun packetHeaderStatement(packetHeaderStatement: PacketHeaderStatementRequestProperty.Builder.() -> Unit):
          Unit = packetHeaderStatement(PacketHeaderStatementRequestProperty(packetHeaderStatement))

      /**
       * @param resourceStatement The resource statement.
       */
      override fun resourceStatement(resourceStatement: IResolvable) {
        cdkBuilder.resourceStatement(resourceStatement.let(IResolvable::unwrap))
      }

      /**
       * @param resourceStatement The resource statement.
       */
      override fun resourceStatement(resourceStatement: ResourceStatementRequestProperty) {
        cdkBuilder.resourceStatement(resourceStatement.let(ResourceStatementRequestProperty::unwrap))
      }

      /**
       * @param resourceStatement The resource statement.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("94af38a3de4afaaf2a082829aef56c9b0e4eed32792656b36dc3cfb773f06d10")
      override
          fun resourceStatement(resourceStatement: ResourceStatementRequestProperty.Builder.() -> Unit):
          Unit = resourceStatement(ResourceStatementRequestProperty(resourceStatement))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.PathStatementRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.PathStatementRequestProperty,
    ) : CdkObject(cdkObject), PathStatementRequestProperty {
      /**
       * The packet header statement.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-pathstatementrequest.html#cfn-ec2-networkinsightsaccessscope-pathstatementrequest-packetheaderstatement)
       */
      override fun packetHeaderStatement(): Any? = unwrap(this).getPacketHeaderStatement()

      /**
       * The resource statement.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-pathstatementrequest.html#cfn-ec2-networkinsightsaccessscope-pathstatementrequest-resourcestatement)
       */
      override fun resourceStatement(): Any? = unwrap(this).getResourceStatement()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PathStatementRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.PathStatementRequestProperty):
          PathStatementRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PathStatementRequestProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.PathStatementRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.PathStatementRequestProperty
    }
  }

  /**
   * Describes a path.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * AccessScopePathRequestProperty accessScopePathRequestProperty =
   * AccessScopePathRequestProperty.builder()
   * .destination(PathStatementRequestProperty.builder()
   * .packetHeaderStatement(PacketHeaderStatementRequestProperty.builder()
   * .destinationAddresses(List.of("destinationAddresses"))
   * .destinationPorts(List.of("destinationPorts"))
   * .destinationPrefixLists(List.of("destinationPrefixLists"))
   * .protocols(List.of("protocols"))
   * .sourceAddresses(List.of("sourceAddresses"))
   * .sourcePorts(List.of("sourcePorts"))
   * .sourcePrefixLists(List.of("sourcePrefixLists"))
   * .build())
   * .resourceStatement(ResourceStatementRequestProperty.builder()
   * .resources(List.of("resources"))
   * .resourceTypes(List.of("resourceTypes"))
   * .build())
   * .build())
   * .source(PathStatementRequestProperty.builder()
   * .packetHeaderStatement(PacketHeaderStatementRequestProperty.builder()
   * .destinationAddresses(List.of("destinationAddresses"))
   * .destinationPorts(List.of("destinationPorts"))
   * .destinationPrefixLists(List.of("destinationPrefixLists"))
   * .protocols(List.of("protocols"))
   * .sourceAddresses(List.of("sourceAddresses"))
   * .sourcePorts(List.of("sourcePorts"))
   * .sourcePrefixLists(List.of("sourcePrefixLists"))
   * .build())
   * .resourceStatement(ResourceStatementRequestProperty.builder()
   * .resources(List.of("resources"))
   * .resourceTypes(List.of("resourceTypes"))
   * .build())
   * .build())
   * .throughResources(List.of(ThroughResourcesStatementRequestProperty.builder()
   * .resourceStatement(ResourceStatementRequestProperty.builder()
   * .resources(List.of("resources"))
   * .resourceTypes(List.of("resourceTypes"))
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-accessscopepathrequest.html)
   */
  public interface AccessScopePathRequestProperty {
    /**
     * The destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-accessscopepathrequest.html#cfn-ec2-networkinsightsaccessscope-accessscopepathrequest-destination)
     */
    public fun destination(): Any? = unwrap(this).getDestination()

    /**
     * The source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-accessscopepathrequest.html#cfn-ec2-networkinsightsaccessscope-accessscopepathrequest-source)
     */
    public fun source(): Any? = unwrap(this).getSource()

    /**
     * The through resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-accessscopepathrequest.html#cfn-ec2-networkinsightsaccessscope-accessscopepathrequest-throughresources)
     */
    public fun throughResources(): Any? = unwrap(this).getThroughResources()

    /**
     * A builder for [AccessScopePathRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destination The destination.
       */
      public fun destination(destination: IResolvable)

      /**
       * @param destination The destination.
       */
      public fun destination(destination: PathStatementRequestProperty)

      /**
       * @param destination The destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1209f052f40165c46e829f5d00392f3ca65d1ec4efcf2823cdd1b16c5daefaaf")
      public fun destination(destination: PathStatementRequestProperty.Builder.() -> Unit)

      /**
       * @param source The source.
       */
      public fun source(source: IResolvable)

      /**
       * @param source The source.
       */
      public fun source(source: PathStatementRequestProperty)

      /**
       * @param source The source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e32f15217edb30ee0f70053d61737d03c0ab342e15686f7c971a56274e5fdc6")
      public fun source(source: PathStatementRequestProperty.Builder.() -> Unit)

      /**
       * @param throughResources The through resources.
       */
      public fun throughResources(throughResources: IResolvable)

      /**
       * @param throughResources The through resources.
       */
      public fun throughResources(throughResources: List<Any>)

      /**
       * @param throughResources The through resources.
       */
      public fun throughResources(vararg throughResources: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.AccessScopePathRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.AccessScopePathRequestProperty.builder()

      /**
       * @param destination The destination.
       */
      override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      /**
       * @param destination The destination.
       */
      override fun destination(destination: PathStatementRequestProperty) {
        cdkBuilder.destination(destination.let(PathStatementRequestProperty::unwrap))
      }

      /**
       * @param destination The destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1209f052f40165c46e829f5d00392f3ca65d1ec4efcf2823cdd1b16c5daefaaf")
      override fun destination(destination: PathStatementRequestProperty.Builder.() -> Unit): Unit =
          destination(PathStatementRequestProperty(destination))

      /**
       * @param source The source.
       */
      override fun source(source: IResolvable) {
        cdkBuilder.source(source.let(IResolvable::unwrap))
      }

      /**
       * @param source The source.
       */
      override fun source(source: PathStatementRequestProperty) {
        cdkBuilder.source(source.let(PathStatementRequestProperty::unwrap))
      }

      /**
       * @param source The source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e32f15217edb30ee0f70053d61737d03c0ab342e15686f7c971a56274e5fdc6")
      override fun source(source: PathStatementRequestProperty.Builder.() -> Unit): Unit =
          source(PathStatementRequestProperty(source))

      /**
       * @param throughResources The through resources.
       */
      override fun throughResources(throughResources: IResolvable) {
        cdkBuilder.throughResources(throughResources.let(IResolvable::unwrap))
      }

      /**
       * @param throughResources The through resources.
       */
      override fun throughResources(throughResources: List<Any>) {
        cdkBuilder.throughResources(throughResources)
      }

      /**
       * @param throughResources The through resources.
       */
      override fun throughResources(vararg throughResources: Any): Unit =
          throughResources(throughResources.toList())

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.AccessScopePathRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.AccessScopePathRequestProperty,
    ) : CdkObject(cdkObject), AccessScopePathRequestProperty {
      /**
       * The destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-accessscopepathrequest.html#cfn-ec2-networkinsightsaccessscope-accessscopepathrequest-destination)
       */
      override fun destination(): Any? = unwrap(this).getDestination()

      /**
       * The source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-accessscopepathrequest.html#cfn-ec2-networkinsightsaccessscope-accessscopepathrequest-source)
       */
      override fun source(): Any? = unwrap(this).getSource()

      /**
       * The through resources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-accessscopepathrequest.html#cfn-ec2-networkinsightsaccessscope-accessscopepathrequest-throughresources)
       */
      override fun throughResources(): Any? = unwrap(this).getThroughResources()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessScopePathRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.AccessScopePathRequestProperty):
          AccessScopePathRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessScopePathRequestProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.AccessScopePathRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.AccessScopePathRequestProperty
    }
  }

  /**
   * Describes a packet header statement.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * PacketHeaderStatementRequestProperty packetHeaderStatementRequestProperty =
   * PacketHeaderStatementRequestProperty.builder()
   * .destinationAddresses(List.of("destinationAddresses"))
   * .destinationPorts(List.of("destinationPorts"))
   * .destinationPrefixLists(List.of("destinationPrefixLists"))
   * .protocols(List.of("protocols"))
   * .sourceAddresses(List.of("sourceAddresses"))
   * .sourcePorts(List.of("sourcePorts"))
   * .sourcePrefixLists(List.of("sourcePrefixLists"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-packetheaderstatementrequest.html)
   */
  public interface PacketHeaderStatementRequestProperty {
    /**
     * The destination addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-packetheaderstatementrequest.html#cfn-ec2-networkinsightsaccessscope-packetheaderstatementrequest-destinationaddresses)
     */
    public fun destinationAddresses(): List<String> = unwrap(this).getDestinationAddresses() ?:
        emptyList()

    /**
     * The destination ports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-packetheaderstatementrequest.html#cfn-ec2-networkinsightsaccessscope-packetheaderstatementrequest-destinationports)
     */
    public fun destinationPorts(): List<String> = unwrap(this).getDestinationPorts() ?: emptyList()

    /**
     * The destination prefix lists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-packetheaderstatementrequest.html#cfn-ec2-networkinsightsaccessscope-packetheaderstatementrequest-destinationprefixlists)
     */
    public fun destinationPrefixLists(): List<String> = unwrap(this).getDestinationPrefixLists() ?:
        emptyList()

    /**
     * The protocols.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-packetheaderstatementrequest.html#cfn-ec2-networkinsightsaccessscope-packetheaderstatementrequest-protocols)
     */
    public fun protocols(): List<String> = unwrap(this).getProtocols() ?: emptyList()

    /**
     * The source addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-packetheaderstatementrequest.html#cfn-ec2-networkinsightsaccessscope-packetheaderstatementrequest-sourceaddresses)
     */
    public fun sourceAddresses(): List<String> = unwrap(this).getSourceAddresses() ?: emptyList()

    /**
     * The source ports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-packetheaderstatementrequest.html#cfn-ec2-networkinsightsaccessscope-packetheaderstatementrequest-sourceports)
     */
    public fun sourcePorts(): List<String> = unwrap(this).getSourcePorts() ?: emptyList()

    /**
     * The source prefix lists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-packetheaderstatementrequest.html#cfn-ec2-networkinsightsaccessscope-packetheaderstatementrequest-sourceprefixlists)
     */
    public fun sourcePrefixLists(): List<String> = unwrap(this).getSourcePrefixLists() ?:
        emptyList()

    /**
     * A builder for [PacketHeaderStatementRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinationAddresses The destination addresses.
       */
      public fun destinationAddresses(destinationAddresses: List<String>)

      /**
       * @param destinationAddresses The destination addresses.
       */
      public fun destinationAddresses(vararg destinationAddresses: String)

      /**
       * @param destinationPorts The destination ports.
       */
      public fun destinationPorts(destinationPorts: List<String>)

      /**
       * @param destinationPorts The destination ports.
       */
      public fun destinationPorts(vararg destinationPorts: String)

      /**
       * @param destinationPrefixLists The destination prefix lists.
       */
      public fun destinationPrefixLists(destinationPrefixLists: List<String>)

      /**
       * @param destinationPrefixLists The destination prefix lists.
       */
      public fun destinationPrefixLists(vararg destinationPrefixLists: String)

      /**
       * @param protocols The protocols.
       */
      public fun protocols(protocols: List<String>)

      /**
       * @param protocols The protocols.
       */
      public fun protocols(vararg protocols: String)

      /**
       * @param sourceAddresses The source addresses.
       */
      public fun sourceAddresses(sourceAddresses: List<String>)

      /**
       * @param sourceAddresses The source addresses.
       */
      public fun sourceAddresses(vararg sourceAddresses: String)

      /**
       * @param sourcePorts The source ports.
       */
      public fun sourcePorts(sourcePorts: List<String>)

      /**
       * @param sourcePorts The source ports.
       */
      public fun sourcePorts(vararg sourcePorts: String)

      /**
       * @param sourcePrefixLists The source prefix lists.
       */
      public fun sourcePrefixLists(sourcePrefixLists: List<String>)

      /**
       * @param sourcePrefixLists The source prefix lists.
       */
      public fun sourcePrefixLists(vararg sourcePrefixLists: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.PacketHeaderStatementRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.PacketHeaderStatementRequestProperty.builder()

      /**
       * @param destinationAddresses The destination addresses.
       */
      override fun destinationAddresses(destinationAddresses: List<String>) {
        cdkBuilder.destinationAddresses(destinationAddresses)
      }

      /**
       * @param destinationAddresses The destination addresses.
       */
      override fun destinationAddresses(vararg destinationAddresses: String): Unit =
          destinationAddresses(destinationAddresses.toList())

      /**
       * @param destinationPorts The destination ports.
       */
      override fun destinationPorts(destinationPorts: List<String>) {
        cdkBuilder.destinationPorts(destinationPorts)
      }

      /**
       * @param destinationPorts The destination ports.
       */
      override fun destinationPorts(vararg destinationPorts: String): Unit =
          destinationPorts(destinationPorts.toList())

      /**
       * @param destinationPrefixLists The destination prefix lists.
       */
      override fun destinationPrefixLists(destinationPrefixLists: List<String>) {
        cdkBuilder.destinationPrefixLists(destinationPrefixLists)
      }

      /**
       * @param destinationPrefixLists The destination prefix lists.
       */
      override fun destinationPrefixLists(vararg destinationPrefixLists: String): Unit =
          destinationPrefixLists(destinationPrefixLists.toList())

      /**
       * @param protocols The protocols.
       */
      override fun protocols(protocols: List<String>) {
        cdkBuilder.protocols(protocols)
      }

      /**
       * @param protocols The protocols.
       */
      override fun protocols(vararg protocols: String): Unit = protocols(protocols.toList())

      /**
       * @param sourceAddresses The source addresses.
       */
      override fun sourceAddresses(sourceAddresses: List<String>) {
        cdkBuilder.sourceAddresses(sourceAddresses)
      }

      /**
       * @param sourceAddresses The source addresses.
       */
      override fun sourceAddresses(vararg sourceAddresses: String): Unit =
          sourceAddresses(sourceAddresses.toList())

      /**
       * @param sourcePorts The source ports.
       */
      override fun sourcePorts(sourcePorts: List<String>) {
        cdkBuilder.sourcePorts(sourcePorts)
      }

      /**
       * @param sourcePorts The source ports.
       */
      override fun sourcePorts(vararg sourcePorts: String): Unit = sourcePorts(sourcePorts.toList())

      /**
       * @param sourcePrefixLists The source prefix lists.
       */
      override fun sourcePrefixLists(sourcePrefixLists: List<String>) {
        cdkBuilder.sourcePrefixLists(sourcePrefixLists)
      }

      /**
       * @param sourcePrefixLists The source prefix lists.
       */
      override fun sourcePrefixLists(vararg sourcePrefixLists: String): Unit =
          sourcePrefixLists(sourcePrefixLists.toList())

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.PacketHeaderStatementRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.PacketHeaderStatementRequestProperty,
    ) : CdkObject(cdkObject), PacketHeaderStatementRequestProperty {
      /**
       * The destination addresses.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-packetheaderstatementrequest.html#cfn-ec2-networkinsightsaccessscope-packetheaderstatementrequest-destinationaddresses)
       */
      override fun destinationAddresses(): List<String> = unwrap(this).getDestinationAddresses() ?:
          emptyList()

      /**
       * The destination ports.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-packetheaderstatementrequest.html#cfn-ec2-networkinsightsaccessscope-packetheaderstatementrequest-destinationports)
       */
      override fun destinationPorts(): List<String> = unwrap(this).getDestinationPorts() ?:
          emptyList()

      /**
       * The destination prefix lists.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-packetheaderstatementrequest.html#cfn-ec2-networkinsightsaccessscope-packetheaderstatementrequest-destinationprefixlists)
       */
      override fun destinationPrefixLists(): List<String> = unwrap(this).getDestinationPrefixLists()
          ?: emptyList()

      /**
       * The protocols.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-packetheaderstatementrequest.html#cfn-ec2-networkinsightsaccessscope-packetheaderstatementrequest-protocols)
       */
      override fun protocols(): List<String> = unwrap(this).getProtocols() ?: emptyList()

      /**
       * The source addresses.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-packetheaderstatementrequest.html#cfn-ec2-networkinsightsaccessscope-packetheaderstatementrequest-sourceaddresses)
       */
      override fun sourceAddresses(): List<String> = unwrap(this).getSourceAddresses() ?:
          emptyList()

      /**
       * The source ports.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-packetheaderstatementrequest.html#cfn-ec2-networkinsightsaccessscope-packetheaderstatementrequest-sourceports)
       */
      override fun sourcePorts(): List<String> = unwrap(this).getSourcePorts() ?: emptyList()

      /**
       * The source prefix lists.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-packetheaderstatementrequest.html#cfn-ec2-networkinsightsaccessscope-packetheaderstatementrequest-sourceprefixlists)
       */
      override fun sourcePrefixLists(): List<String> = unwrap(this).getSourcePrefixLists() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PacketHeaderStatementRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.PacketHeaderStatementRequestProperty):
          PacketHeaderStatementRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PacketHeaderStatementRequestProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.PacketHeaderStatementRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.PacketHeaderStatementRequestProperty
    }
  }

  /**
   * Describes a resource statement.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * ResourceStatementRequestProperty resourceStatementRequestProperty =
   * ResourceStatementRequestProperty.builder()
   * .resources(List.of("resources"))
   * .resourceTypes(List.of("resourceTypes"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-resourcestatementrequest.html)
   */
  public interface ResourceStatementRequestProperty {
    /**
     * The resource types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-resourcestatementrequest.html#cfn-ec2-networkinsightsaccessscope-resourcestatementrequest-resourcetypes)
     */
    public fun resourceTypes(): List<String> = unwrap(this).getResourceTypes() ?: emptyList()

    /**
     * The resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-resourcestatementrequest.html#cfn-ec2-networkinsightsaccessscope-resourcestatementrequest-resources)
     */
    public fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

    /**
     * A builder for [ResourceStatementRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceTypes The resource types.
       */
      public fun resourceTypes(resourceTypes: List<String>)

      /**
       * @param resourceTypes The resource types.
       */
      public fun resourceTypes(vararg resourceTypes: String)

      /**
       * @param resources The resources.
       */
      public fun resources(resources: List<String>)

      /**
       * @param resources The resources.
       */
      public fun resources(vararg resources: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.ResourceStatementRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.ResourceStatementRequestProperty.builder()

      /**
       * @param resourceTypes The resource types.
       */
      override fun resourceTypes(resourceTypes: List<String>) {
        cdkBuilder.resourceTypes(resourceTypes)
      }

      /**
       * @param resourceTypes The resource types.
       */
      override fun resourceTypes(vararg resourceTypes: String): Unit =
          resourceTypes(resourceTypes.toList())

      /**
       * @param resources The resources.
       */
      override fun resources(resources: List<String>) {
        cdkBuilder.resources(resources)
      }

      /**
       * @param resources The resources.
       */
      override fun resources(vararg resources: String): Unit = resources(resources.toList())

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.ResourceStatementRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.ResourceStatementRequestProperty,
    ) : CdkObject(cdkObject), ResourceStatementRequestProperty {
      /**
       * The resource types.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-resourcestatementrequest.html#cfn-ec2-networkinsightsaccessscope-resourcestatementrequest-resourcetypes)
       */
      override fun resourceTypes(): List<String> = unwrap(this).getResourceTypes() ?: emptyList()

      /**
       * The resources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-resourcestatementrequest.html#cfn-ec2-networkinsightsaccessscope-resourcestatementrequest-resources)
       */
      override fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceStatementRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.ResourceStatementRequestProperty):
          ResourceStatementRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceStatementRequestProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.ResourceStatementRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope.ResourceStatementRequestProperty
    }
  }
}
