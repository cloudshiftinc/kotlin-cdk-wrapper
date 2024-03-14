package io.cloudshiftdev.awscdk

import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface ICfnResourceOptions {
  /**
   * A condition to associate with this resource.
   *
   * This means that only if the condition evaluates to 'true' when the stack
   * is deployed, the resource will be included. This is provided to allow CDK projects to produce
   * legacy templates, but normally
   * there is no need to use it in CDK projects.
   */
  public fun condition(): CfnCondition? = unwrap(this).getCondition()?.let(CfnCondition::wrap)

  /**
   * A condition to associate with this resource.
   *
   * This means that only if the condition evaluates to 'true' when the stack
   * is deployed, the resource will be included. This is provided to allow CDK projects to produce
   * legacy templates, but normally
   * there is no need to use it in CDK projects.
   */
  public fun condition(`value`: CfnCondition) {
    unwrap(this).setCondition(`value`.let(CfnCondition::unwrap))
  }

  /**
   * Associate the CreationPolicy attribute with a resource to prevent its status from reaching
   * create complete until AWS CloudFormation receives a specified number of success signals or the
   * timeout period is exceeded.
   *
   * To signal a
   * resource, you can use the cfn-signal helper script or SignalResource API. AWS CloudFormation
   * publishes valid signals
   * to the stack events so that you track the number of signals sent.
   */
  public fun creationPolicy(): CfnCreationPolicy? =
      unwrap(this).getCreationPolicy()?.let(CfnCreationPolicy::wrap)

  /**
   * Associate the CreationPolicy attribute with a resource to prevent its status from reaching
   * create complete until AWS CloudFormation receives a specified number of success signals or the
   * timeout period is exceeded.
   *
   * To signal a
   * resource, you can use the cfn-signal helper script or SignalResource API. AWS CloudFormation
   * publishes valid signals
   * to the stack events so that you track the number of signals sent.
   */
  public fun creationPolicy(`value`: CfnCreationPolicy) {
    unwrap(this).setCreationPolicy(`value`.let(CfnCreationPolicy::unwrap))
  }

  /**
   * Associate the CreationPolicy attribute with a resource to prevent its status from reaching
   * create complete until AWS CloudFormation receives a specified number of success signals or the
   * timeout period is exceeded.
   *
   * To signal a
   * resource, you can use the cfn-signal helper script or SignalResource API. AWS CloudFormation
   * publishes valid signals
   * to the stack events so that you track the number of signals sent.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9f9d917a5cde8d1fde292583205fe2e655a58f531b5b04be946bdc3c8b4e87fd")
  public fun creationPolicy(`value`: CfnCreationPolicy.Builder.() -> Unit): Unit =
      creationPolicy(CfnCreationPolicy(`value`))

  /**
   * With the DeletionPolicy attribute you can preserve or (in some cases) backup a resource when
   * its stack is deleted.
   *
   * You specify a DeletionPolicy attribute for each resource that you want to control. If a
   * resource has no DeletionPolicy
   * attribute, AWS CloudFormation deletes the resource by default. Note that this capability also
   * applies to update operations
   * that lead to resources being removed.
   */
  public fun deletionPolicy(): CfnDeletionPolicy? =
      unwrap(this).getDeletionPolicy()?.let(CfnDeletionPolicy::wrap)

  /**
   * With the DeletionPolicy attribute you can preserve or (in some cases) backup a resource when
   * its stack is deleted.
   *
   * You specify a DeletionPolicy attribute for each resource that you want to control. If a
   * resource has no DeletionPolicy
   * attribute, AWS CloudFormation deletes the resource by default. Note that this capability also
   * applies to update operations
   * that lead to resources being removed.
   */
  public fun deletionPolicy(`value`: CfnDeletionPolicy) {
    unwrap(this).setDeletionPolicy(`value`.let(CfnDeletionPolicy::unwrap))
  }

  /**
   * The description of this resource.
   *
   * Used for informational purposes only, is not processed in any way
   * (and stays with the CloudFormation template, is not passed to the underlying resource,
   * even if it does have a 'description' property).
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of this resource.
   *
   * Used for informational purposes only, is not processed in any way
   * (and stays with the CloudFormation template, is not passed to the underlying resource,
   * even if it does have a 'description' property).
   */
  public fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Metadata associated with the CloudFormation resource.
   *
   * This is not the same as the construct metadata which can be added
   * using construct.addMetadata(), but would not appear in the CloudFormation template
   * automatically.
   */
  public fun metadata(): Map<String, Any> = unwrap(this).getMetadata() ?: emptyMap()

  /**
   * Metadata associated with the CloudFormation resource.
   *
   * This is not the same as the construct metadata which can be added
   * using construct.addMetadata(), but would not appear in the CloudFormation template
   * automatically.
   */
  public fun metadata(`value`: Map<String, Any>) {
    unwrap(this).setMetadata(`value`)
  }

  /**
   * Use the UpdatePolicy attribute to specify how AWS CloudFormation handles updates to the
   * AWS::AutoScaling::AutoScalingGroup resource.
   *
   * AWS CloudFormation invokes one of three update policies depending on the type of change you
   * make or whether a
   * scheduled action is associated with the Auto Scaling group.
   */
  public fun updatePolicy(): CfnUpdatePolicy? =
      unwrap(this).getUpdatePolicy()?.let(CfnUpdatePolicy::wrap)

  /**
   * Use the UpdatePolicy attribute to specify how AWS CloudFormation handles updates to the
   * AWS::AutoScaling::AutoScalingGroup resource.
   *
   * AWS CloudFormation invokes one of three update policies depending on the type of change you
   * make or whether a
   * scheduled action is associated with the Auto Scaling group.
   */
  public fun updatePolicy(`value`: CfnUpdatePolicy) {
    unwrap(this).setUpdatePolicy(`value`.let(CfnUpdatePolicy::unwrap))
  }

  /**
   * Use the UpdatePolicy attribute to specify how AWS CloudFormation handles updates to the
   * AWS::AutoScaling::AutoScalingGroup resource.
   *
   * AWS CloudFormation invokes one of three update policies depending on the type of change you
   * make or whether a
   * scheduled action is associated with the Auto Scaling group.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e9471f918a8b2facdd7d489a0a869f9807ab48719e8be3e28eb42ffbfb14a06c")
  public fun updatePolicy(`value`: CfnUpdatePolicy.Builder.() -> Unit): Unit =
      updatePolicy(CfnUpdatePolicy(`value`))

  /**
   * Use the UpdateReplacePolicy attribute to retain or (in some cases) backup the existing physical
   * instance of a resource when it is replaced during a stack update operation.
   */
  public fun updateReplacePolicy(): CfnDeletionPolicy? =
      unwrap(this).getUpdateReplacePolicy()?.let(CfnDeletionPolicy::wrap)

  /**
   * Use the UpdateReplacePolicy attribute to retain or (in some cases) backup the existing physical
   * instance of a resource when it is replaced during a stack update operation.
   */
  public fun updateReplacePolicy(`value`: CfnDeletionPolicy) {
    unwrap(this).setUpdateReplacePolicy(`value`.let(CfnDeletionPolicy::unwrap))
  }

  /**
   * The version of this resource.
   *
   * Used only for custom CloudFormation resources.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cfn-customresource.html)
   */
  public fun version(): String? = unwrap(this).getVersion()

  /**
   * The version of this resource.
   *
   * Used only for custom CloudFormation resources.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cfn-customresource.html)
   */
  public fun version(`value`: String) {
    unwrap(this).setVersion(`value`)
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.ICfnResourceOptions,
  ) : ICfnResourceOptions {
    /**
     * A condition to associate with this resource.
     *
     * This means that only if the condition evaluates to 'true' when the stack
     * is deployed, the resource will be included. This is provided to allow CDK projects to produce
     * legacy templates, but normally
     * there is no need to use it in CDK projects.
     */
    override fun condition(): CfnCondition? = unwrap(this).getCondition()?.let(CfnCondition::wrap)

    /**
     * A condition to associate with this resource.
     *
     * This means that only if the condition evaluates to 'true' when the stack
     * is deployed, the resource will be included. This is provided to allow CDK projects to produce
     * legacy templates, but normally
     * there is no need to use it in CDK projects.
     */
    override fun condition(`value`: CfnCondition) {
      unwrap(this).setCondition(`value`.let(CfnCondition::unwrap))
    }

    /**
     * Associate the CreationPolicy attribute with a resource to prevent its status from reaching
     * create complete until AWS CloudFormation receives a specified number of success signals or the
     * timeout period is exceeded.
     *
     * To signal a
     * resource, you can use the cfn-signal helper script or SignalResource API. AWS CloudFormation
     * publishes valid signals
     * to the stack events so that you track the number of signals sent.
     */
    override fun creationPolicy(): CfnCreationPolicy? =
        unwrap(this).getCreationPolicy()?.let(CfnCreationPolicy::wrap)

    /**
     * Associate the CreationPolicy attribute with a resource to prevent its status from reaching
     * create complete until AWS CloudFormation receives a specified number of success signals or the
     * timeout period is exceeded.
     *
     * To signal a
     * resource, you can use the cfn-signal helper script or SignalResource API. AWS CloudFormation
     * publishes valid signals
     * to the stack events so that you track the number of signals sent.
     */
    override fun creationPolicy(`value`: CfnCreationPolicy) {
      unwrap(this).setCreationPolicy(`value`.let(CfnCreationPolicy::unwrap))
    }

    /**
     * Associate the CreationPolicy attribute with a resource to prevent its status from reaching
     * create complete until AWS CloudFormation receives a specified number of success signals or the
     * timeout period is exceeded.
     *
     * To signal a
     * resource, you can use the cfn-signal helper script or SignalResource API. AWS CloudFormation
     * publishes valid signals
     * to the stack events so that you track the number of signals sent.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f9d917a5cde8d1fde292583205fe2e655a58f531b5b04be946bdc3c8b4e87fd")
    override fun creationPolicy(`value`: CfnCreationPolicy.Builder.() -> Unit): Unit =
        creationPolicy(CfnCreationPolicy(`value`))

    /**
     * With the DeletionPolicy attribute you can preserve or (in some cases) backup a resource when
     * its stack is deleted.
     *
     * You specify a DeletionPolicy attribute for each resource that you want to control. If a
     * resource has no DeletionPolicy
     * attribute, AWS CloudFormation deletes the resource by default. Note that this capability also
     * applies to update operations
     * that lead to resources being removed.
     */
    override fun deletionPolicy(): CfnDeletionPolicy? =
        unwrap(this).getDeletionPolicy()?.let(CfnDeletionPolicy::wrap)

    /**
     * With the DeletionPolicy attribute you can preserve or (in some cases) backup a resource when
     * its stack is deleted.
     *
     * You specify a DeletionPolicy attribute for each resource that you want to control. If a
     * resource has no DeletionPolicy
     * attribute, AWS CloudFormation deletes the resource by default. Note that this capability also
     * applies to update operations
     * that lead to resources being removed.
     */
    override fun deletionPolicy(`value`: CfnDeletionPolicy) {
      unwrap(this).setDeletionPolicy(`value`.let(CfnDeletionPolicy::unwrap))
    }

    /**
     * The description of this resource.
     *
     * Used for informational purposes only, is not processed in any way
     * (and stays with the CloudFormation template, is not passed to the underlying resource,
     * even if it does have a 'description' property).
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The description of this resource.
     *
     * Used for informational purposes only, is not processed in any way
     * (and stays with the CloudFormation template, is not passed to the underlying resource,
     * even if it does have a 'description' property).
     */
    override fun description(`value`: String) {
      unwrap(this).setDescription(`value`)
    }

    /**
     * Metadata associated with the CloudFormation resource.
     *
     * This is not the same as the construct metadata which can be added
     * using construct.addMetadata(), but would not appear in the CloudFormation template
     * automatically.
     */
    override fun metadata(): Map<String, Any> = unwrap(this).getMetadata() ?: emptyMap()

    /**
     * Metadata associated with the CloudFormation resource.
     *
     * This is not the same as the construct metadata which can be added
     * using construct.addMetadata(), but would not appear in the CloudFormation template
     * automatically.
     */
    override fun metadata(`value`: Map<String, Any>) {
      unwrap(this).setMetadata(`value`)
    }

    /**
     * Use the UpdatePolicy attribute to specify how AWS CloudFormation handles updates to the
     * AWS::AutoScaling::AutoScalingGroup resource.
     *
     * AWS CloudFormation invokes one of three update policies depending on the type of change you
     * make or whether a
     * scheduled action is associated with the Auto Scaling group.
     */
    override fun updatePolicy(): CfnUpdatePolicy? =
        unwrap(this).getUpdatePolicy()?.let(CfnUpdatePolicy::wrap)

    /**
     * Use the UpdatePolicy attribute to specify how AWS CloudFormation handles updates to the
     * AWS::AutoScaling::AutoScalingGroup resource.
     *
     * AWS CloudFormation invokes one of three update policies depending on the type of change you
     * make or whether a
     * scheduled action is associated with the Auto Scaling group.
     */
    override fun updatePolicy(`value`: CfnUpdatePolicy) {
      unwrap(this).setUpdatePolicy(`value`.let(CfnUpdatePolicy::unwrap))
    }

    /**
     * Use the UpdatePolicy attribute to specify how AWS CloudFormation handles updates to the
     * AWS::AutoScaling::AutoScalingGroup resource.
     *
     * AWS CloudFormation invokes one of three update policies depending on the type of change you
     * make or whether a
     * scheduled action is associated with the Auto Scaling group.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9471f918a8b2facdd7d489a0a869f9807ab48719e8be3e28eb42ffbfb14a06c")
    override fun updatePolicy(`value`: CfnUpdatePolicy.Builder.() -> Unit): Unit =
        updatePolicy(CfnUpdatePolicy(`value`))

    /**
     * Use the UpdateReplacePolicy attribute to retain or (in some cases) backup the existing
     * physical instance of a resource when it is replaced during a stack update operation.
     */
    override fun updateReplacePolicy(): CfnDeletionPolicy? =
        unwrap(this).getUpdateReplacePolicy()?.let(CfnDeletionPolicy::wrap)

    /**
     * Use the UpdateReplacePolicy attribute to retain or (in some cases) backup the existing
     * physical instance of a resource when it is replaced during a stack update operation.
     */
    override fun updateReplacePolicy(`value`: CfnDeletionPolicy) {
      unwrap(this).setUpdateReplacePolicy(`value`.let(CfnDeletionPolicy::unwrap))
    }

    /**
     * The version of this resource.
     *
     * Used only for custom CloudFormation resources.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cfn-customresource.html)
     */
    override fun version(): String? = unwrap(this).getVersion()

    /**
     * The version of this resource.
     *
     * Used only for custom CloudFormation resources.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cfn-customresource.html)
     */
    override fun version(`value`: String) {
      unwrap(this).setVersion(`value`)
    }
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.ICfnResourceOptions): ICfnResourceOptions =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICfnResourceOptions): software.amazon.awscdk.ICfnResourceOptions =
        (wrapped as Wrapper).cdkObject
  }
}
