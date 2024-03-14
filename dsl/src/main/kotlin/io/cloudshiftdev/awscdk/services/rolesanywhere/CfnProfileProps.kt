package io.cloudshiftdev.awscdk.services.rolesanywhere

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnProfileProps {
  /**
   * The number of seconds vended session credentials will be valid for.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-durationseconds)
   */
  public fun durationSeconds(): Number? = unwrap(this).getDurationSeconds()

  /**
   * The enabled status of the resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-enabled)
   */
  public fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * A list of managed policy ARNs.
   *
   * Managed policies identified by this list will be applied to the vended session credentials.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-managedpolicyarns)
   */
  public fun managedPolicyArns(): List<String> = unwrap(this).getManagedPolicyArns() ?: emptyList()

  /**
   * The customer specified name of the resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-name)
   */
  public fun name(): String

  /**
   * Specifies whether instance properties are required in CreateSession requests with this profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-requireinstanceproperties)
   */
  public fun requireInstanceProperties(): Any? = unwrap(this).getRequireInstanceProperties()

  /**
   * A list of IAM role ARNs that can be assumed when this profile is specified in a CreateSession
   * request.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-rolearns)
   */
  public fun roleArns(): List<String>

  /**
   * A session policy that will applied to the trust boundary of the vended session credentials.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-sessionpolicy)
   */
  public fun sessionPolicy(): String? = unwrap(this).getSessionPolicy()

  /**
   * A list of Tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param durationSeconds The number of seconds vended session credentials will be valid for.
     */
    public fun durationSeconds(durationSeconds: Number)

    /**
     * @param enabled The enabled status of the resource.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param enabled The enabled status of the resource.
     */
    public fun enabled(enabled: IResolvable)

    /**
     * @param managedPolicyArns A list of managed policy ARNs.
     * Managed policies identified by this list will be applied to the vended session credentials.
     */
    public fun managedPolicyArns(managedPolicyArns: List<String>)

    /**
     * @param managedPolicyArns A list of managed policy ARNs.
     * Managed policies identified by this list will be applied to the vended session credentials.
     */
    public fun managedPolicyArns(vararg managedPolicyArns: String)

    /**
     * @param name The customer specified name of the resource. 
     */
    public fun name(name: String)

    /**
     * @param requireInstanceProperties Specifies whether instance properties are required in
     * CreateSession requests with this profile.
     */
    public fun requireInstanceProperties(requireInstanceProperties: Boolean)

    /**
     * @param requireInstanceProperties Specifies whether instance properties are required in
     * CreateSession requests with this profile.
     */
    public fun requireInstanceProperties(requireInstanceProperties: IResolvable)

    /**
     * @param roleArns A list of IAM role ARNs that can be assumed when this profile is specified in
     * a CreateSession request. 
     */
    public fun roleArns(roleArns: List<String>)

    /**
     * @param roleArns A list of IAM role ARNs that can be assumed when this profile is specified in
     * a CreateSession request. 
     */
    public fun roleArns(vararg roleArns: String)

    /**
     * @param sessionPolicy A session policy that will applied to the trust boundary of the vended
     * session credentials.
     */
    public fun sessionPolicy(sessionPolicy: String)

    /**
     * @param tags A list of Tags.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of Tags.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rolesanywhere.CfnProfileProps.Builder =
        software.amazon.awscdk.services.rolesanywhere.CfnProfileProps.builder()

    /**
     * @param durationSeconds The number of seconds vended session credentials will be valid for.
     */
    override fun durationSeconds(durationSeconds: Number) {
      cdkBuilder.durationSeconds(durationSeconds)
    }

    /**
     * @param enabled The enabled status of the resource.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled The enabled status of the resource.
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    /**
     * @param managedPolicyArns A list of managed policy ARNs.
     * Managed policies identified by this list will be applied to the vended session credentials.
     */
    override fun managedPolicyArns(managedPolicyArns: List<String>) {
      cdkBuilder.managedPolicyArns(managedPolicyArns)
    }

    /**
     * @param managedPolicyArns A list of managed policy ARNs.
     * Managed policies identified by this list will be applied to the vended session credentials.
     */
    override fun managedPolicyArns(vararg managedPolicyArns: String): Unit =
        managedPolicyArns(managedPolicyArns.toList())

    /**
     * @param name The customer specified name of the resource. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param requireInstanceProperties Specifies whether instance properties are required in
     * CreateSession requests with this profile.
     */
    override fun requireInstanceProperties(requireInstanceProperties: Boolean) {
      cdkBuilder.requireInstanceProperties(requireInstanceProperties)
    }

    /**
     * @param requireInstanceProperties Specifies whether instance properties are required in
     * CreateSession requests with this profile.
     */
    override fun requireInstanceProperties(requireInstanceProperties: IResolvable) {
      cdkBuilder.requireInstanceProperties(requireInstanceProperties.let(IResolvable::unwrap))
    }

    /**
     * @param roleArns A list of IAM role ARNs that can be assumed when this profile is specified in
     * a CreateSession request. 
     */
    override fun roleArns(roleArns: List<String>) {
      cdkBuilder.roleArns(roleArns)
    }

    /**
     * @param roleArns A list of IAM role ARNs that can be assumed when this profile is specified in
     * a CreateSession request. 
     */
    override fun roleArns(vararg roleArns: String): Unit = roleArns(roleArns.toList())

    /**
     * @param sessionPolicy A session policy that will applied to the trust boundary of the vended
     * session credentials.
     */
    override fun sessionPolicy(sessionPolicy: String) {
      cdkBuilder.sessionPolicy(sessionPolicy)
    }

    /**
     * @param tags A list of Tags.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of Tags.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rolesanywhere.CfnProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnProfileProps,
  ) : CdkObject(cdkObject), CfnProfileProps {
    /**
     * The number of seconds vended session credentials will be valid for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-durationseconds)
     */
    override fun durationSeconds(): Number? = unwrap(this).getDurationSeconds()

    /**
     * The enabled status of the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-enabled)
     */
    override fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * A list of managed policy ARNs.
     *
     * Managed policies identified by this list will be applied to the vended session credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-managedpolicyarns)
     */
    override fun managedPolicyArns(): List<String> = unwrap(this).getManagedPolicyArns() ?:
        emptyList()

    /**
     * The customer specified name of the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Specifies whether instance properties are required in CreateSession requests with this
     * profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-requireinstanceproperties)
     */
    override fun requireInstanceProperties(): Any? = unwrap(this).getRequireInstanceProperties()

    /**
     * A list of IAM role ARNs that can be assumed when this profile is specified in a CreateSession
     * request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-rolearns)
     */
    override fun roleArns(): List<String> = unwrap(this).getRoleArns()

    /**
     * A session policy that will applied to the trust boundary of the vended session credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-sessionpolicy)
     */
    override fun sessionPolicy(): String? = unwrap(this).getSessionPolicy()

    /**
     * A list of Tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rolesanywhere-profile.html#cfn-rolesanywhere-profile-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnProfileProps):
        CfnProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProfileProps):
        software.amazon.awscdk.services.rolesanywhere.CfnProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rolesanywhere.CfnProfileProps
  }
}
