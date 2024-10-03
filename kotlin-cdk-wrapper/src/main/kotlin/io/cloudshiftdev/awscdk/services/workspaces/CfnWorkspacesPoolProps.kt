@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspaces

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnWorkspacesPool`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.workspaces.*;
 * CfnWorkspacesPoolProps cfnWorkspacesPoolProps = CfnWorkspacesPoolProps.builder()
 * .bundleId("bundleId")
 * .capacity(CapacityProperty.builder()
 * .desiredUserSessions(123)
 * .build())
 * .directoryId("directoryId")
 * .poolName("poolName")
 * // the properties below are optional
 * .applicationSettings(ApplicationSettingsProperty.builder()
 * .status("status")
 * // the properties below are optional
 * .settingsGroup("settingsGroup")
 * .build())
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .timeoutSettings(TimeoutSettingsProperty.builder()
 * .disconnectTimeoutInSeconds(123)
 * .idleDisconnectTimeoutInSeconds(123)
 * .maxUserDurationInSeconds(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html)
 */
public interface CfnWorkspacesPoolProps {
  /**
   * The persistent application settings for users of the pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-applicationsettings)
   */
  public fun applicationSettings(): Any? = unwrap(this).getApplicationSettings()

  /**
   * The identifier of the bundle used by the pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-bundleid)
   */
  public fun bundleId(): String

  /**
   * Describes the user capacity for the pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-capacity)
   */
  public fun capacity(): Any

  /**
   * The description of the pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The identifier of the directory used by the pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-directoryid)
   */
  public fun directoryId(): String

  /**
   * The name of the pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-poolname)
   */
  public fun poolName(): String

  /**
   * The tags for the pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The amount of time that a pool session remains active after users disconnect.
   *
   * If they try to reconnect to the pool session after a disconnection or network interruption
   * within this time interval, they are connected to their previous session. Otherwise, they are
   * connected to a new session with a new pool instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-timeoutsettings)
   */
  public fun timeoutSettings(): Any? = unwrap(this).getTimeoutSettings()

  /**
   * A builder for [CfnWorkspacesPoolProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationSettings The persistent application settings for users of the pool.
     */
    public fun applicationSettings(applicationSettings: IResolvable)

    /**
     * @param applicationSettings The persistent application settings for users of the pool.
     */
    public
        fun applicationSettings(applicationSettings: CfnWorkspacesPool.ApplicationSettingsProperty)

    /**
     * @param applicationSettings The persistent application settings for users of the pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("052c475c0a12ae88016b63d96835df7c574a1a4e589920168b4a9c909fb1641e")
    public
        fun applicationSettings(applicationSettings: CfnWorkspacesPool.ApplicationSettingsProperty.Builder.() -> Unit)

    /**
     * @param bundleId The identifier of the bundle used by the pool. 
     */
    public fun bundleId(bundleId: String)

    /**
     * @param capacity Describes the user capacity for the pool. 
     */
    public fun capacity(capacity: IResolvable)

    /**
     * @param capacity Describes the user capacity for the pool. 
     */
    public fun capacity(capacity: CfnWorkspacesPool.CapacityProperty)

    /**
     * @param capacity Describes the user capacity for the pool. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f7f0d4b6d98659ac067576ad8df970b16c4fecb437dc7bb78663cc34a8746ba")
    public fun capacity(capacity: CfnWorkspacesPool.CapacityProperty.Builder.() -> Unit)

    /**
     * @param description The description of the pool.
     */
    public fun description(description: String)

    /**
     * @param directoryId The identifier of the directory used by the pool. 
     */
    public fun directoryId(directoryId: String)

    /**
     * @param poolName The name of the pool. 
     */
    public fun poolName(poolName: String)

    /**
     * @param tags The tags for the pool.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for the pool.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param timeoutSettings The amount of time that a pool session remains active after users
     * disconnect.
     * If they try to reconnect to the pool session after a disconnection or network interruption
     * within this time interval, they are connected to their previous session. Otherwise, they are
     * connected to a new session with a new pool instance.
     */
    public fun timeoutSettings(timeoutSettings: IResolvable)

    /**
     * @param timeoutSettings The amount of time that a pool session remains active after users
     * disconnect.
     * If they try to reconnect to the pool session after a disconnection or network interruption
     * within this time interval, they are connected to their previous session. Otherwise, they are
     * connected to a new session with a new pool instance.
     */
    public fun timeoutSettings(timeoutSettings: CfnWorkspacesPool.TimeoutSettingsProperty)

    /**
     * @param timeoutSettings The amount of time that a pool session remains active after users
     * disconnect.
     * If they try to reconnect to the pool session after a disconnection or network interruption
     * within this time interval, they are connected to their previous session. Otherwise, they are
     * connected to a new session with a new pool instance.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b445a52ee740ea424cbffee60b31978a114007f8bb5aba556834f3dce3982e73")
    public
        fun timeoutSettings(timeoutSettings: CfnWorkspacesPool.TimeoutSettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspaces.CfnWorkspacesPoolProps.Builder =
        software.amazon.awscdk.services.workspaces.CfnWorkspacesPoolProps.builder()

    /**
     * @param applicationSettings The persistent application settings for users of the pool.
     */
    override fun applicationSettings(applicationSettings: IResolvable) {
      cdkBuilder.applicationSettings(applicationSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param applicationSettings The persistent application settings for users of the pool.
     */
    override
        fun applicationSettings(applicationSettings: CfnWorkspacesPool.ApplicationSettingsProperty) {
      cdkBuilder.applicationSettings(applicationSettings.let(CfnWorkspacesPool.ApplicationSettingsProperty.Companion::unwrap))
    }

    /**
     * @param applicationSettings The persistent application settings for users of the pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("052c475c0a12ae88016b63d96835df7c574a1a4e589920168b4a9c909fb1641e")
    override
        fun applicationSettings(applicationSettings: CfnWorkspacesPool.ApplicationSettingsProperty.Builder.() -> Unit):
        Unit =
        applicationSettings(CfnWorkspacesPool.ApplicationSettingsProperty(applicationSettings))

    /**
     * @param bundleId The identifier of the bundle used by the pool. 
     */
    override fun bundleId(bundleId: String) {
      cdkBuilder.bundleId(bundleId)
    }

    /**
     * @param capacity Describes the user capacity for the pool. 
     */
    override fun capacity(capacity: IResolvable) {
      cdkBuilder.capacity(capacity.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param capacity Describes the user capacity for the pool. 
     */
    override fun capacity(capacity: CfnWorkspacesPool.CapacityProperty) {
      cdkBuilder.capacity(capacity.let(CfnWorkspacesPool.CapacityProperty.Companion::unwrap))
    }

    /**
     * @param capacity Describes the user capacity for the pool. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f7f0d4b6d98659ac067576ad8df970b16c4fecb437dc7bb78663cc34a8746ba")
    override fun capacity(capacity: CfnWorkspacesPool.CapacityProperty.Builder.() -> Unit): Unit =
        capacity(CfnWorkspacesPool.CapacityProperty(capacity))

    /**
     * @param description The description of the pool.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param directoryId The identifier of the directory used by the pool. 
     */
    override fun directoryId(directoryId: String) {
      cdkBuilder.directoryId(directoryId)
    }

    /**
     * @param poolName The name of the pool. 
     */
    override fun poolName(poolName: String) {
      cdkBuilder.poolName(poolName)
    }

    /**
     * @param tags The tags for the pool.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags for the pool.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param timeoutSettings The amount of time that a pool session remains active after users
     * disconnect.
     * If they try to reconnect to the pool session after a disconnection or network interruption
     * within this time interval, they are connected to their previous session. Otherwise, they are
     * connected to a new session with a new pool instance.
     */
    override fun timeoutSettings(timeoutSettings: IResolvable) {
      cdkBuilder.timeoutSettings(timeoutSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param timeoutSettings The amount of time that a pool session remains active after users
     * disconnect.
     * If they try to reconnect to the pool session after a disconnection or network interruption
     * within this time interval, they are connected to their previous session. Otherwise, they are
     * connected to a new session with a new pool instance.
     */
    override fun timeoutSettings(timeoutSettings: CfnWorkspacesPool.TimeoutSettingsProperty) {
      cdkBuilder.timeoutSettings(timeoutSettings.let(CfnWorkspacesPool.TimeoutSettingsProperty.Companion::unwrap))
    }

    /**
     * @param timeoutSettings The amount of time that a pool session remains active after users
     * disconnect.
     * If they try to reconnect to the pool session after a disconnection or network interruption
     * within this time interval, they are connected to their previous session. Otherwise, they are
     * connected to a new session with a new pool instance.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b445a52ee740ea424cbffee60b31978a114007f8bb5aba556834f3dce3982e73")
    override
        fun timeoutSettings(timeoutSettings: CfnWorkspacesPool.TimeoutSettingsProperty.Builder.() -> Unit):
        Unit = timeoutSettings(CfnWorkspacesPool.TimeoutSettingsProperty(timeoutSettings))

    public fun build(): software.amazon.awscdk.services.workspaces.CfnWorkspacesPoolProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.workspaces.CfnWorkspacesPoolProps,
  ) : CdkObject(cdkObject),
      CfnWorkspacesPoolProps {
    /**
     * The persistent application settings for users of the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-applicationsettings)
     */
    override fun applicationSettings(): Any? = unwrap(this).getApplicationSettings()

    /**
     * The identifier of the bundle used by the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-bundleid)
     */
    override fun bundleId(): String = unwrap(this).getBundleId()

    /**
     * Describes the user capacity for the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-capacity)
     */
    override fun capacity(): Any = unwrap(this).getCapacity()

    /**
     * The description of the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The identifier of the directory used by the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-directoryid)
     */
    override fun directoryId(): String = unwrap(this).getDirectoryId()

    /**
     * The name of the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-poolname)
     */
    override fun poolName(): String = unwrap(this).getPoolName()

    /**
     * The tags for the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The amount of time that a pool session remains active after users disconnect.
     *
     * If they try to reconnect to the pool session after a disconnection or network interruption
     * within this time interval, they are connected to their previous session. Otherwise, they are
     * connected to a new session with a new pool instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspacespool.html#cfn-workspaces-workspacespool-timeoutsettings)
     */
    override fun timeoutSettings(): Any? = unwrap(this).getTimeoutSettings()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWorkspacesPoolProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.workspaces.CfnWorkspacesPoolProps):
        CfnWorkspacesPoolProps = CdkObjectWrappers.wrap(cdkObject) as? CfnWorkspacesPoolProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWorkspacesPoolProps):
        software.amazon.awscdk.services.workspaces.CfnWorkspacesPoolProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.workspaces.CfnWorkspacesPoolProps
  }
}
