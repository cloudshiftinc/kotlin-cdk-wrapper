@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Node
import kotlin.Number
import kotlin.String
import kotlin.collections.List

/**
 *
 */
public interface IExtension : IResource {
  /**
   * The actions for the extension.
   */
  public fun actions(): List<Action> = unwrap(this).getActions()?.map(Action::wrap) ?: emptyList()

  /**
   * The description of the extension.
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The Amazon Resource Name (ARN) of the extension.
   */
  public fun extensionArn(): String

  /**
   * The ID of the extension.
   */
  public fun extensionId(): String

  /**
   * The version number of the extension.
   */
  public fun extensionVersionNumber(): Number

  /**
   * The latest version number of the extension.
   */
  public fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

  /**
   * The name of the extension.
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The parameters of the extension.
   */
  public fun parameters(): List<Parameter> = unwrap(this).getParameters()?.map(Parameter::wrap) ?:
      emptyList()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appconfig.IExtension,
  ) : CdkObject(cdkObject), IExtension {
    /**
     * The actions for the extension.
     */
    override fun actions(): List<Action> = unwrap(this).getActions()?.map(Action::wrap) ?:
        emptyList()

    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * The description of the extension.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * The Amazon Resource Name (ARN) of the extension.
     */
    override fun extensionArn(): String = unwrap(this).getExtensionArn()

    /**
     * The ID of the extension.
     */
    override fun extensionId(): String = unwrap(this).getExtensionId()

    /**
     * The version number of the extension.
     */
    override fun extensionVersionNumber(): Number = unwrap(this).getExtensionVersionNumber()

    /**
     * The latest version number of the extension.
     */
    override fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

    /**
     * The name of the extension.
     */
    override fun name(): String? = unwrap(this).getName()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The parameters of the extension.
     */
    override fun parameters(): List<Parameter> = unwrap(this).getParameters()?.map(Parameter::wrap)
        ?: emptyList()

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.IExtension): IExtension =
        CdkObjectWrappers.wrap(cdkObject) as? IExtension ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IExtension): software.amazon.awscdk.services.appconfig.IExtension =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.IExtension
  }
}
