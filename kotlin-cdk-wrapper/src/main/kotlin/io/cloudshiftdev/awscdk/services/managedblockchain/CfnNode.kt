@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.managedblockchain

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
 * Creates a node on the specified blockchain network.
 *
 * Applies to Hyperledger Fabric and Ethereum.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.managedblockchain.*;
 * CfnNode cfnNode = CfnNode.Builder.create(this, "MyCfnNode")
 * .networkId("networkId")
 * .nodeConfiguration(NodeConfigurationProperty.builder()
 * .availabilityZone("availabilityZone")
 * .instanceType("instanceType")
 * .build())
 * // the properties below are optional
 * .memberId("memberId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html)
 */
public open class CfnNode(
  cdkObject: software.amazon.awscdk.services.managedblockchain.CfnNode,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNodeProps,
  ) :
      this(software.amazon.awscdk.services.managedblockchain.CfnNode(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnNodeProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNodeProps.Builder.() -> Unit,
  ) : this(scope, id, CfnNodeProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the node.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The unique identifier of the member in which the node is created.
   *
   * Applies only to Hyperledger Fabric.
   */
  public open fun attrMemberId(): String = unwrap(this).getAttrMemberId()

  /**
   * The unique identifier of the network that the node is in.
   */
  public open fun attrNetworkId(): String = unwrap(this).getAttrNetworkId()

  /**
   * The unique identifier of the node.
   */
  public open fun attrNodeId(): String = unwrap(this).getAttrNodeId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The unique identifier of the member to which the node belongs.
   */
  public open fun memberId(): String? = unwrap(this).getMemberId()

  /**
   * The unique identifier of the member to which the node belongs.
   */
  public open fun memberId(`value`: String) {
    unwrap(this).setMemberId(`value`)
  }

  /**
   * The unique identifier of the network for the node.
   */
  public open fun networkId(): String = unwrap(this).getNetworkId()

  /**
   * The unique identifier of the network for the node.
   */
  public open fun networkId(`value`: String) {
    unwrap(this).setNetworkId(`value`)
  }

  /**
   * Configuration properties of a peer node.
   */
  public open fun nodeConfiguration(): Any = unwrap(this).getNodeConfiguration()

  /**
   * Configuration properties of a peer node.
   */
  public open fun nodeConfiguration(`value`: IResolvable) {
    unwrap(this).setNodeConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Configuration properties of a peer node.
   */
  public open fun nodeConfiguration(`value`: NodeConfigurationProperty) {
    unwrap(this).setNodeConfiguration(`value`.let(NodeConfigurationProperty.Companion::unwrap))
  }

  /**
   * Configuration properties of a peer node.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3744c2aa38ad0ecdee34189bd441b4f2c87838909119eddc9888c05962431588")
  public open fun nodeConfiguration(`value`: NodeConfigurationProperty.Builder.() -> Unit): Unit =
      nodeConfiguration(NodeConfigurationProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.managedblockchain.CfnNode].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique identifier of the member to which the node belongs.
     *
     * Applies only to Hyperledger Fabric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html#cfn-managedblockchain-node-memberid)
     * @param memberId The unique identifier of the member to which the node belongs. 
     */
    public fun memberId(memberId: String)

    /**
     * The unique identifier of the network for the node.
     *
     * Ethereum public networks have the following `NetworkId` s:
     *
     * * `n-ethereum-mainnet`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html#cfn-managedblockchain-node-networkid)
     * @param networkId The unique identifier of the network for the node. 
     */
    public fun networkId(networkId: String)

    /**
     * Configuration properties of a peer node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html#cfn-managedblockchain-node-nodeconfiguration)
     * @param nodeConfiguration Configuration properties of a peer node. 
     */
    public fun nodeConfiguration(nodeConfiguration: IResolvable)

    /**
     * Configuration properties of a peer node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html#cfn-managedblockchain-node-nodeconfiguration)
     * @param nodeConfiguration Configuration properties of a peer node. 
     */
    public fun nodeConfiguration(nodeConfiguration: NodeConfigurationProperty)

    /**
     * Configuration properties of a peer node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html#cfn-managedblockchain-node-nodeconfiguration)
     * @param nodeConfiguration Configuration properties of a peer node. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25aeecfc6e7cc309f4cae08c5b752d870903f4d2b570694a11231b1a0f3c8055")
    public fun nodeConfiguration(nodeConfiguration: NodeConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.managedblockchain.CfnNode.Builder =
        software.amazon.awscdk.services.managedblockchain.CfnNode.Builder.create(scope, id)

    /**
     * The unique identifier of the member to which the node belongs.
     *
     * Applies only to Hyperledger Fabric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html#cfn-managedblockchain-node-memberid)
     * @param memberId The unique identifier of the member to which the node belongs. 
     */
    override fun memberId(memberId: String) {
      cdkBuilder.memberId(memberId)
    }

    /**
     * The unique identifier of the network for the node.
     *
     * Ethereum public networks have the following `NetworkId` s:
     *
     * * `n-ethereum-mainnet`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html#cfn-managedblockchain-node-networkid)
     * @param networkId The unique identifier of the network for the node. 
     */
    override fun networkId(networkId: String) {
      cdkBuilder.networkId(networkId)
    }

    /**
     * Configuration properties of a peer node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html#cfn-managedblockchain-node-nodeconfiguration)
     * @param nodeConfiguration Configuration properties of a peer node. 
     */
    override fun nodeConfiguration(nodeConfiguration: IResolvable) {
      cdkBuilder.nodeConfiguration(nodeConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Configuration properties of a peer node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html#cfn-managedblockchain-node-nodeconfiguration)
     * @param nodeConfiguration Configuration properties of a peer node. 
     */
    override fun nodeConfiguration(nodeConfiguration: NodeConfigurationProperty) {
      cdkBuilder.nodeConfiguration(nodeConfiguration.let(NodeConfigurationProperty.Companion::unwrap))
    }

    /**
     * Configuration properties of a peer node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html#cfn-managedblockchain-node-nodeconfiguration)
     * @param nodeConfiguration Configuration properties of a peer node. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25aeecfc6e7cc309f4cae08c5b752d870903f4d2b570694a11231b1a0f3c8055")
    override fun nodeConfiguration(nodeConfiguration: NodeConfigurationProperty.Builder.() -> Unit):
        Unit = nodeConfiguration(NodeConfigurationProperty(nodeConfiguration))

    public fun build(): software.amazon.awscdk.services.managedblockchain.CfnNode =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.managedblockchain.CfnNode.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNode {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNode(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.managedblockchain.CfnNode): CfnNode
        = CfnNode(cdkObject)

    internal fun unwrap(wrapped: CfnNode): software.amazon.awscdk.services.managedblockchain.CfnNode
        = wrapped.cdkObject as software.amazon.awscdk.services.managedblockchain.CfnNode
  }

  /**
   * Configuration properties of a peer node within a membership.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.managedblockchain.*;
   * NodeConfigurationProperty nodeConfigurationProperty = NodeConfigurationProperty.builder()
   * .availabilityZone("availabilityZone")
   * .instanceType("instanceType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-node-nodeconfiguration.html)
   */
  public interface NodeConfigurationProperty {
    /**
     * The Availability Zone in which the node exists.
     *
     * Required for Ethereum nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-node-nodeconfiguration.html#cfn-managedblockchain-node-nodeconfiguration-availabilityzone)
     */
    public fun availabilityZone(): String

    /**
     * The Amazon Managed Blockchain instance type for the node.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-node-nodeconfiguration.html#cfn-managedblockchain-node-nodeconfiguration-instancetype)
     */
    public fun instanceType(): String

    /**
     * A builder for [NodeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param availabilityZone The Availability Zone in which the node exists. 
       * Required for Ethereum nodes.
       */
      public fun availabilityZone(availabilityZone: String)

      /**
       * @param instanceType The Amazon Managed Blockchain instance type for the node. 
       */
      public fun instanceType(instanceType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.managedblockchain.CfnNode.NodeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.managedblockchain.CfnNode.NodeConfigurationProperty.builder()

      /**
       * @param availabilityZone The Availability Zone in which the node exists. 
       * Required for Ethereum nodes.
       */
      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      /**
       * @param instanceType The Amazon Managed Blockchain instance type for the node. 
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      public fun build():
          software.amazon.awscdk.services.managedblockchain.CfnNode.NodeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.managedblockchain.CfnNode.NodeConfigurationProperty,
    ) : CdkObject(cdkObject),
        NodeConfigurationProperty {
      /**
       * The Availability Zone in which the node exists.
       *
       * Required for Ethereum nodes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-node-nodeconfiguration.html#cfn-managedblockchain-node-nodeconfiguration-availabilityzone)
       */
      override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

      /**
       * The Amazon Managed Blockchain instance type for the node.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-node-nodeconfiguration.html#cfn-managedblockchain-node-nodeconfiguration-instancetype)
       */
      override fun instanceType(): String = unwrap(this).getInstanceType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NodeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.managedblockchain.CfnNode.NodeConfigurationProperty):
          NodeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NodeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NodeConfigurationProperty):
          software.amazon.awscdk.services.managedblockchain.CfnNode.NodeConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.managedblockchain.CfnNode.NodeConfigurationProperty
    }
  }
}
