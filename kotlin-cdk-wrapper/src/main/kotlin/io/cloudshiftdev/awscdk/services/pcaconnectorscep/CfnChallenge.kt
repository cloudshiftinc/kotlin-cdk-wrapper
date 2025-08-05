@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pcaconnectorscep

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * For general-purpose connectors.
 *
 * Creates a *challenge password* for the specified connector. The SCEP protocol uses a challenge
 * password to authenticate a request before issuing a certificate from a certificate authority (CA).
 * Your SCEP clients include the challenge password as part of their certificate request to Connector
 * for SCEP. To retrieve the connector Amazon Resource Names (ARNs) for the connectors in your account,
 * call
 * [ListConnectors](https://docs.aws.amazon.com/pca-connector-scep/latest/APIReference/API_ListConnectors.html)
 * .
 *
 * To create additional challenge passwords for the connector, call `CreateChallenge` again. We
 * recommend frequently rotating your challenge passwords.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pcaconnectorscep.*;
 * CfnChallenge cfnChallenge = CfnChallenge.Builder.create(this, "MyCfnChallenge")
 * .connectorArn("connectorArn")
 * // the properties below are optional
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorscep-challenge.html)
 */
public open class CfnChallenge(
  cdkObject: software.amazon.awscdk.services.pcaconnectorscep.CfnChallenge,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnChallengeProps,
  ) :
      this(software.amazon.awscdk.services.pcaconnectorscep.CfnChallenge(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnChallengeProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnChallengeProps.Builder.() -> Unit,
  ) : this(scope, id, CfnChallengeProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the challenge.
   */
  public open fun attrChallengeArn(): String = unwrap(this).getAttrChallengeArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The Amazon Resource Name (ARN) of the connector.
   */
  public open fun connectorArn(): String = unwrap(this).getConnectorArn()

  /**
   * The Amazon Resource Name (ARN) of the connector.
   */
  public open fun connectorArn(`value`: String) {
    unwrap(this).setConnectorArn(`value`)
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
   *
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   *
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.pcaconnectorscep.CfnChallenge].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorscep-challenge.html#cfn-pcaconnectorscep-challenge-connectorarn)
     * @param connectorArn The Amazon Resource Name (ARN) of the connector. 
     */
    public fun connectorArn(connectorArn: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorscep-challenge.html#cfn-pcaconnectorscep-challenge-tags)
     * @param tags 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pcaconnectorscep.CfnChallenge.Builder =
        software.amazon.awscdk.services.pcaconnectorscep.CfnChallenge.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorscep-challenge.html#cfn-pcaconnectorscep-challenge-connectorarn)
     * @param connectorArn The Amazon Resource Name (ARN) of the connector. 
     */
    override fun connectorArn(connectorArn: String) {
      cdkBuilder.connectorArn(connectorArn)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcaconnectorscep-challenge.html#cfn-pcaconnectorscep-challenge-tags)
     * @param tags 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.pcaconnectorscep.CfnChallenge =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.pcaconnectorscep.CfnChallenge.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnChallenge {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnChallenge(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorscep.CfnChallenge):
        CfnChallenge = CfnChallenge(cdkObject)

    internal fun unwrap(wrapped: CfnChallenge):
        software.amazon.awscdk.services.pcaconnectorscep.CfnChallenge = wrapped.cdkObject as
        software.amazon.awscdk.services.pcaconnectorscep.CfnChallenge
  }
}
