@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnConnectorDefinitionVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.greengrass.*;
 * Object parameters;
 * CfnConnectorDefinitionVersionProps cfnConnectorDefinitionVersionProps =
 * CfnConnectorDefinitionVersionProps.builder()
 * .connectorDefinitionId("connectorDefinitionId")
 * .connectors(List.of(ConnectorProperty.builder()
 * .connectorArn("connectorArn")
 * .id("id")
 * // the properties below are optional
 * .parameters(parameters)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html)
 */
public interface CfnConnectorDefinitionVersionProps {
  /**
   * The ID of the connector definition associated with this version.
   *
   * This value is a GUID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html#cfn-greengrass-connectordefinitionversion-connectordefinitionid)
   */
  public fun connectorDefinitionId(): String

  /**
   * The connectors in this version.
   *
   * Only one instance of a given connector can be added to the connector definition version at a
   * time.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html#cfn-greengrass-connectordefinitionversion-connectors)
   */
  public fun connectors(): Any

  /**
   * A builder for [CfnConnectorDefinitionVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param connectorDefinitionId The ID of the connector definition associated with this version.
     * 
     * This value is a GUID.
     */
    public fun connectorDefinitionId(connectorDefinitionId: String)

    /**
     * @param connectors The connectors in this version. 
     * Only one instance of a given connector can be added to the connector definition version at a
     * time.
     */
    public fun connectors(connectors: IResolvable)

    /**
     * @param connectors The connectors in this version. 
     * Only one instance of a given connector can be added to the connector definition version at a
     * time.
     */
    public fun connectors(connectors: List<Any>)

    /**
     * @param connectors The connectors in this version. 
     * Only one instance of a given connector can be added to the connector definition version at a
     * time.
     */
    public fun connectors(vararg connectors: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersionProps.Builder =
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersionProps.builder()

    /**
     * @param connectorDefinitionId The ID of the connector definition associated with this version.
     * 
     * This value is a GUID.
     */
    override fun connectorDefinitionId(connectorDefinitionId: String) {
      cdkBuilder.connectorDefinitionId(connectorDefinitionId)
    }

    /**
     * @param connectors The connectors in this version. 
     * Only one instance of a given connector can be added to the connector definition version at a
     * time.
     */
    override fun connectors(connectors: IResolvable) {
      cdkBuilder.connectors(connectors.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param connectors The connectors in this version. 
     * Only one instance of a given connector can be added to the connector definition version at a
     * time.
     */
    override fun connectors(connectors: List<Any>) {
      cdkBuilder.connectors(connectors.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param connectors The connectors in this version. 
     * Only one instance of a given connector can be added to the connector definition version at a
     * time.
     */
    override fun connectors(vararg connectors: Any): Unit = connectors(connectors.toList())

    public fun build():
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersionProps,
  ) : CdkObject(cdkObject),
      CfnConnectorDefinitionVersionProps {
    /**
     * The ID of the connector definition associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html#cfn-greengrass-connectordefinitionversion-connectordefinitionid)
     */
    override fun connectorDefinitionId(): String = unwrap(this).getConnectorDefinitionId()

    /**
     * The connectors in this version.
     *
     * Only one instance of a given connector can be added to the connector definition version at a
     * time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html#cfn-greengrass-connectordefinitionversion-connectors)
     */
    override fun connectors(): Any = unwrap(this).getConnectors()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectorDefinitionVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersionProps):
        CfnConnectorDefinitionVersionProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnConnectorDefinitionVersionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConnectorDefinitionVersionProps):
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersionProps
  }
}
