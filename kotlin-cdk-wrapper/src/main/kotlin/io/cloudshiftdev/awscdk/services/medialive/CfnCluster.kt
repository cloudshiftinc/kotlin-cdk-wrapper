@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

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
 * Definition of AWS::MediaLive::Cluster Resource Type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.medialive.*;
 * CfnCluster cfnCluster = CfnCluster.Builder.create(this, "MyCfnCluster")
 * .clusterType("clusterType")
 * .instanceRoleArn("instanceRoleArn")
 * .name("name")
 * .networkSettings(ClusterNetworkSettingsProperty.builder()
 * .defaultRoute("defaultRoute")
 * .interfaceMappings(List.of(InterfaceMappingProperty.builder()
 * .logicalInterfaceName("logicalInterfaceName")
 * .networkId("networkId")
 * .build()))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cluster.html)
 */
public open class CfnCluster(
  cdkObject: software.amazon.awscdk.services.medialive.CfnCluster,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.medialive.CfnCluster(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnClusterProps,
  ) :
      this(software.amazon.awscdk.services.medialive.CfnCluster(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnClusterProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnClusterProps.Builder.() -> Unit,
  ) : this(scope, id, CfnClusterProps(props)
  )

  /**
   * The ARN of the Cluster.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The MediaLive Channels that are currently running on Nodes in this Cluster.
   */
  public open fun attrChannelIds(): List<String> = unwrap(this).getAttrChannelIds()

  /**
   * The unique ID of the Cluster.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The current state of the Cluster.
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The hardware type for the cluster.
   */
  public open fun clusterType(): String? = unwrap(this).getClusterType()

  /**
   * The hardware type for the cluster.
   */
  public open fun clusterType(`value`: String) {
    unwrap(this).setClusterType(`value`)
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
   * The IAM role your nodes will use.
   */
  public open fun instanceRoleArn(): String? = unwrap(this).getInstanceRoleArn()

  /**
   * The IAM role your nodes will use.
   */
  public open fun instanceRoleArn(`value`: String) {
    unwrap(this).setInstanceRoleArn(`value`)
  }

  /**
   * The user-specified name of the Cluster to be created.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The user-specified name of the Cluster to be created.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * On premises settings which will have the interface network mappings and default Output logical
   * interface.
   */
  public open fun networkSettings(): Any? = unwrap(this).getNetworkSettings()

  /**
   * On premises settings which will have the interface network mappings and default Output logical
   * interface.
   */
  public open fun networkSettings(`value`: IResolvable) {
    unwrap(this).setNetworkSettings(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * On premises settings which will have the interface network mappings and default Output logical
   * interface.
   */
  public open fun networkSettings(`value`: ClusterNetworkSettingsProperty) {
    unwrap(this).setNetworkSettings(`value`.let(ClusterNetworkSettingsProperty.Companion::unwrap))
  }

  /**
   * On premises settings which will have the interface network mappings and default Output logical
   * interface.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("341784dccadbfd0fb49cdba90751bad2a657f66dc319870b5475a8606e7af9e5")
  public open fun networkSettings(`value`: ClusterNetworkSettingsProperty.Builder.() -> Unit): Unit
      = networkSettings(ClusterNetworkSettingsProperty(`value`))

  /**
   * A collection of key-value pairs.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A collection of key-value pairs.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A collection of key-value pairs.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.medialive.CfnCluster].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The hardware type for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cluster.html#cfn-medialive-cluster-clustertype)
     * @param clusterType The hardware type for the cluster. 
     */
    public fun clusterType(clusterType: String)

    /**
     * The IAM role your nodes will use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cluster.html#cfn-medialive-cluster-instancerolearn)
     * @param instanceRoleArn The IAM role your nodes will use. 
     */
    public fun instanceRoleArn(instanceRoleArn: String)

    /**
     * The user-specified name of the Cluster to be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cluster.html#cfn-medialive-cluster-name)
     * @param name The user-specified name of the Cluster to be created. 
     */
    public fun name(name: String)

    /**
     * On premises settings which will have the interface network mappings and default Output
     * logical interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cluster.html#cfn-medialive-cluster-networksettings)
     * @param networkSettings On premises settings which will have the interface network mappings
     * and default Output logical interface. 
     */
    public fun networkSettings(networkSettings: IResolvable)

    /**
     * On premises settings which will have the interface network mappings and default Output
     * logical interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cluster.html#cfn-medialive-cluster-networksettings)
     * @param networkSettings On premises settings which will have the interface network mappings
     * and default Output logical interface. 
     */
    public fun networkSettings(networkSettings: ClusterNetworkSettingsProperty)

    /**
     * On premises settings which will have the interface network mappings and default Output
     * logical interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cluster.html#cfn-medialive-cluster-networksettings)
     * @param networkSettings On premises settings which will have the interface network mappings
     * and default Output logical interface. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("512ede4b632ea08b21124f1a464e407f51e5134bdceb1904c271f9b890a87891")
    public fun networkSettings(networkSettings: ClusterNetworkSettingsProperty.Builder.() -> Unit)

    /**
     * A collection of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cluster.html#cfn-medialive-cluster-tags)
     * @param tags A collection of key-value pairs. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A collection of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cluster.html#cfn-medialive-cluster-tags)
     * @param tags A collection of key-value pairs. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.medialive.CfnCluster.Builder =
        software.amazon.awscdk.services.medialive.CfnCluster.Builder.create(scope, id)

    /**
     * The hardware type for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cluster.html#cfn-medialive-cluster-clustertype)
     * @param clusterType The hardware type for the cluster. 
     */
    override fun clusterType(clusterType: String) {
      cdkBuilder.clusterType(clusterType)
    }

    /**
     * The IAM role your nodes will use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cluster.html#cfn-medialive-cluster-instancerolearn)
     * @param instanceRoleArn The IAM role your nodes will use. 
     */
    override fun instanceRoleArn(instanceRoleArn: String) {
      cdkBuilder.instanceRoleArn(instanceRoleArn)
    }

    /**
     * The user-specified name of the Cluster to be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cluster.html#cfn-medialive-cluster-name)
     * @param name The user-specified name of the Cluster to be created. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * On premises settings which will have the interface network mappings and default Output
     * logical interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cluster.html#cfn-medialive-cluster-networksettings)
     * @param networkSettings On premises settings which will have the interface network mappings
     * and default Output logical interface. 
     */
    override fun networkSettings(networkSettings: IResolvable) {
      cdkBuilder.networkSettings(networkSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * On premises settings which will have the interface network mappings and default Output
     * logical interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cluster.html#cfn-medialive-cluster-networksettings)
     * @param networkSettings On premises settings which will have the interface network mappings
     * and default Output logical interface. 
     */
    override fun networkSettings(networkSettings: ClusterNetworkSettingsProperty) {
      cdkBuilder.networkSettings(networkSettings.let(ClusterNetworkSettingsProperty.Companion::unwrap))
    }

    /**
     * On premises settings which will have the interface network mappings and default Output
     * logical interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cluster.html#cfn-medialive-cluster-networksettings)
     * @param networkSettings On premises settings which will have the interface network mappings
     * and default Output logical interface. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("512ede4b632ea08b21124f1a464e407f51e5134bdceb1904c271f9b890a87891")
    override
        fun networkSettings(networkSettings: ClusterNetworkSettingsProperty.Builder.() -> Unit):
        Unit = networkSettings(ClusterNetworkSettingsProperty(networkSettings))

    /**
     * A collection of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cluster.html#cfn-medialive-cluster-tags)
     * @param tags A collection of key-value pairs. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A collection of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cluster.html#cfn-medialive-cluster-tags)
     * @param tags A collection of key-value pairs. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.medialive.CfnCluster = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.medialive.CfnCluster.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnCluster): CfnCluster =
        CfnCluster(cdkObject)

    internal fun unwrap(wrapped: CfnCluster): software.amazon.awscdk.services.medialive.CfnCluster =
        wrapped.cdkObject as software.amazon.awscdk.services.medialive.CfnCluster
  }

  /**
   * On premises settings which will have the interface network mappings and default Output logical
   * interface.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.medialive.*;
   * ClusterNetworkSettingsProperty clusterNetworkSettingsProperty =
   * ClusterNetworkSettingsProperty.builder()
   * .defaultRoute("defaultRoute")
   * .interfaceMappings(List.of(InterfaceMappingProperty.builder()
   * .logicalInterfaceName("logicalInterfaceName")
   * .networkId("networkId")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-cluster-clusternetworksettings.html)
   */
  public interface ClusterNetworkSettingsProperty {
    /**
     * Default value if the customer does not define it in channel Output API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-cluster-clusternetworksettings.html#cfn-medialive-cluster-clusternetworksettings-defaultroute)
     */
    public fun defaultRoute(): String? = unwrap(this).getDefaultRoute()

    /**
     * Network mappings for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-cluster-clusternetworksettings.html#cfn-medialive-cluster-clusternetworksettings-interfacemappings)
     */
    public fun interfaceMappings(): Any? = unwrap(this).getInterfaceMappings()

    /**
     * A builder for [ClusterNetworkSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultRoute Default value if the customer does not define it in channel Output API.
       */
      public fun defaultRoute(defaultRoute: String)

      /**
       * @param interfaceMappings Network mappings for the cluster.
       */
      public fun interfaceMappings(interfaceMappings: IResolvable)

      /**
       * @param interfaceMappings Network mappings for the cluster.
       */
      public fun interfaceMappings(interfaceMappings: List<Any>)

      /**
       * @param interfaceMappings Network mappings for the cluster.
       */
      public fun interfaceMappings(vararg interfaceMappings: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnCluster.ClusterNetworkSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnCluster.ClusterNetworkSettingsProperty.builder()

      /**
       * @param defaultRoute Default value if the customer does not define it in channel Output API.
       */
      override fun defaultRoute(defaultRoute: String) {
        cdkBuilder.defaultRoute(defaultRoute)
      }

      /**
       * @param interfaceMappings Network mappings for the cluster.
       */
      override fun interfaceMappings(interfaceMappings: IResolvable) {
        cdkBuilder.interfaceMappings(interfaceMappings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param interfaceMappings Network mappings for the cluster.
       */
      override fun interfaceMappings(interfaceMappings: List<Any>) {
        cdkBuilder.interfaceMappings(interfaceMappings.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param interfaceMappings Network mappings for the cluster.
       */
      override fun interfaceMappings(vararg interfaceMappings: Any): Unit =
          interfaceMappings(interfaceMappings.toList())

      public fun build():
          software.amazon.awscdk.services.medialive.CfnCluster.ClusterNetworkSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.medialive.CfnCluster.ClusterNetworkSettingsProperty,
    ) : CdkObject(cdkObject),
        ClusterNetworkSettingsProperty {
      /**
       * Default value if the customer does not define it in channel Output API.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-cluster-clusternetworksettings.html#cfn-medialive-cluster-clusternetworksettings-defaultroute)
       */
      override fun defaultRoute(): String? = unwrap(this).getDefaultRoute()

      /**
       * Network mappings for the cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-cluster-clusternetworksettings.html#cfn-medialive-cluster-clusternetworksettings-interfacemappings)
       */
      override fun interfaceMappings(): Any? = unwrap(this).getInterfaceMappings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClusterNetworkSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnCluster.ClusterNetworkSettingsProperty):
          ClusterNetworkSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ClusterNetworkSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClusterNetworkSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnCluster.ClusterNetworkSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnCluster.ClusterNetworkSettingsProperty
    }
  }

  /**
   * Network mappings for the cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.medialive.*;
   * InterfaceMappingProperty interfaceMappingProperty = InterfaceMappingProperty.builder()
   * .logicalInterfaceName("logicalInterfaceName")
   * .networkId("networkId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-cluster-interfacemapping.html)
   */
  public interface InterfaceMappingProperty {
    /**
     * logical interface name, unique in the list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-cluster-interfacemapping.html#cfn-medialive-cluster-interfacemapping-logicalinterfacename)
     */
    public fun logicalInterfaceName(): String? = unwrap(this).getLogicalInterfaceName()

    /**
     * Network Id to be associated with the logical interface name, can be duplicated in list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-cluster-interfacemapping.html#cfn-medialive-cluster-interfacemapping-networkid)
     */
    public fun networkId(): String? = unwrap(this).getNetworkId()

    /**
     * A builder for [InterfaceMappingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logicalInterfaceName logical interface name, unique in the list.
       */
      public fun logicalInterfaceName(logicalInterfaceName: String)

      /**
       * @param networkId Network Id to be associated with the logical interface name, can be
       * duplicated in list.
       */
      public fun networkId(networkId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnCluster.InterfaceMappingProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnCluster.InterfaceMappingProperty.builder()

      /**
       * @param logicalInterfaceName logical interface name, unique in the list.
       */
      override fun logicalInterfaceName(logicalInterfaceName: String) {
        cdkBuilder.logicalInterfaceName(logicalInterfaceName)
      }

      /**
       * @param networkId Network Id to be associated with the logical interface name, can be
       * duplicated in list.
       */
      override fun networkId(networkId: String) {
        cdkBuilder.networkId(networkId)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnCluster.InterfaceMappingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.medialive.CfnCluster.InterfaceMappingProperty,
    ) : CdkObject(cdkObject),
        InterfaceMappingProperty {
      /**
       * logical interface name, unique in the list.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-cluster-interfacemapping.html#cfn-medialive-cluster-interfacemapping-logicalinterfacename)
       */
      override fun logicalInterfaceName(): String? = unwrap(this).getLogicalInterfaceName()

      /**
       * Network Id to be associated with the logical interface name, can be duplicated in list.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-cluster-interfacemapping.html#cfn-medialive-cluster-interfacemapping-networkid)
       */
      override fun networkId(): String? = unwrap(this).getNetworkId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InterfaceMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnCluster.InterfaceMappingProperty):
          InterfaceMappingProperty = CdkObjectWrappers.wrap(cdkObject) as? InterfaceMappingProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InterfaceMappingProperty):
          software.amazon.awscdk.services.medialive.CfnCluster.InterfaceMappingProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnCluster.InterfaceMappingProperty
    }
  }
}
