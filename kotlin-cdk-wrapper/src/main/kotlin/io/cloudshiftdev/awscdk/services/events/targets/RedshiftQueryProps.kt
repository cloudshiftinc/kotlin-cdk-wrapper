@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Configuration properties of an Amazon Redshift Query event.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.redshiftserverless.*;
 * CfnWorkgroup workgroup;
 * Rule rule = Rule.Builder.create(this, "Rule")
 * .schedule(Schedule.rate(Duration.hours(1)))
 * .build();
 * Queue dlq = new Queue(this, "DeadLetterQueue");
 * rule.addTarget(RedshiftQuery.Builder.create(workgroup.getAttrWorkgroupWorkgroupArn())
 * .database("dev")
 * .deadLetterQueue(dlq)
 * .sql(List.of("SELECT * FROM foo", "SELECT * FROM baz"))
 * .build());
 * ```
 */
public interface RedshiftQueryProps {
  /**
   * The Amazon Redshift database to run the query against.
   */
  public fun database(): String

  /**
   * The Amazon Redshift database user to run the query as.
   *
   * This is required when authenticating via temporary credentials.
   *
   * Default: - No Database user is specified
   */
  public fun dbUser(): String? = unwrap(this).getDbUser()

  /**
   * The queue to be used as dead letter queue.
   *
   * Default: - No dead letter queue is specified
   */
  public fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

  /**
   * The input to the state machine execution.
   *
   * Default: - the entire EventBridge event
   */
  public fun input(): RuleTargetInput? = unwrap(this).getInput()?.let(RuleTargetInput::wrap)

  /**
   * The IAM role to be used to execute the SQL statement.
   *
   * Default: - a new role will be created.
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * The secret containing the password for the database user.
   *
   * This is required when authenticating via Secrets Manager.
   * If the full secret ARN is not specified, this will instead use the secret name.
   *
   * Default: - No secret is specified
   */
  public fun secret(): ISecret? = unwrap(this).getSecret()?.let(ISecret::wrap)

  /**
   * Should an event be sent back to Event Bridge when the SQL statement is executed.
   *
   * Default: false
   */
  public fun sendEventBridgeEvent(): Boolean? = unwrap(this).getSendEventBridgeEvent()

  /**
   * The SQL queries to be executed.
   *
   * Each query is run sequentially within a single transaction; the next query in the array will
   * only execute after the previous one has successfully completed.
   *
   * * When multiple sql queries are included, this will use the `batchExecuteStatement` API.
   * Therefore, if any statement fails, the entire transaction is rolled back.
   * * If a single SQL statement is to be executed, this will use the `executeStatement` API.
   *
   * Default: - No SQL query is specified
   */
  public fun sql(): List<String>

  /**
   * The name of the SQL statement.
   *
   * You can name the SQL statement for identitfication purposes. If you would like Amazon Redshift
   * to identify the Event Bridge rule, and present it in the Amazon Redshift console, append a `QS2-`
   * prefix to the statement name.
   *
   * Default: - No statement name is specified
   */
  public fun statementName(): String? = unwrap(this).getStatementName()

  /**
   * A builder for [RedshiftQueryProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param database The Amazon Redshift database to run the query against. 
     */
    public fun database(database: String)

    /**
     * @param dbUser The Amazon Redshift database user to run the query as.
     * This is required when authenticating via temporary credentials.
     */
    public fun dbUser(dbUser: String)

    /**
     * @param deadLetterQueue The queue to be used as dead letter queue.
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * @param input The input to the state machine execution.
     */
    public fun input(input: RuleTargetInput)

    /**
     * @param role The IAM role to be used to execute the SQL statement.
     */
    public fun role(role: IRole)

    /**
     * @param secret The secret containing the password for the database user.
     * This is required when authenticating via Secrets Manager.
     * If the full secret ARN is not specified, this will instead use the secret name.
     */
    public fun secret(secret: ISecret)

    /**
     * @param sendEventBridgeEvent Should an event be sent back to Event Bridge when the SQL
     * statement is executed.
     */
    public fun sendEventBridgeEvent(sendEventBridgeEvent: Boolean)

    /**
     * @param sql The SQL queries to be executed. 
     * Each query is run sequentially within a single transaction; the next query in the array will
     * only execute after the previous one has successfully completed.
     *
     * * When multiple sql queries are included, this will use the `batchExecuteStatement` API.
     * Therefore, if any statement fails, the entire transaction is rolled back.
     * * If a single SQL statement is to be executed, this will use the `executeStatement` API.
     */
    public fun sql(sql: List<String>)

    /**
     * @param sql The SQL queries to be executed. 
     * Each query is run sequentially within a single transaction; the next query in the array will
     * only execute after the previous one has successfully completed.
     *
     * * When multiple sql queries are included, this will use the `batchExecuteStatement` API.
     * Therefore, if any statement fails, the entire transaction is rolled back.
     * * If a single SQL statement is to be executed, this will use the `executeStatement` API.
     */
    public fun sql(vararg sql: String)

    /**
     * @param statementName The name of the SQL statement.
     * You can name the SQL statement for identitfication purposes. If you would like Amazon
     * Redshift to identify the Event Bridge rule, and present it in the Amazon Redshift console,
     * append a `QS2-` prefix to the statement name.
     */
    public fun statementName(statementName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.events.targets.RedshiftQueryProps.Builder =
        software.amazon.awscdk.services.events.targets.RedshiftQueryProps.builder()

    /**
     * @param database The Amazon Redshift database to run the query against. 
     */
    override fun database(database: String) {
      cdkBuilder.database(database)
    }

    /**
     * @param dbUser The Amazon Redshift database user to run the query as.
     * This is required when authenticating via temporary credentials.
     */
    override fun dbUser(dbUser: String) {
      cdkBuilder.dbUser(dbUser)
    }

    /**
     * @param deadLetterQueue The queue to be used as dead letter queue.
     */
    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue.Companion::unwrap))
    }

    /**
     * @param input The input to the state machine execution.
     */
    override fun input(input: RuleTargetInput) {
      cdkBuilder.input(input.let(RuleTargetInput.Companion::unwrap))
    }

    /**
     * @param role The IAM role to be used to execute the SQL statement.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * @param secret The secret containing the password for the database user.
     * This is required when authenticating via Secrets Manager.
     * If the full secret ARN is not specified, this will instead use the secret name.
     */
    override fun secret(secret: ISecret) {
      cdkBuilder.secret(secret.let(ISecret.Companion::unwrap))
    }

    /**
     * @param sendEventBridgeEvent Should an event be sent back to Event Bridge when the SQL
     * statement is executed.
     */
    override fun sendEventBridgeEvent(sendEventBridgeEvent: Boolean) {
      cdkBuilder.sendEventBridgeEvent(sendEventBridgeEvent)
    }

    /**
     * @param sql The SQL queries to be executed. 
     * Each query is run sequentially within a single transaction; the next query in the array will
     * only execute after the previous one has successfully completed.
     *
     * * When multiple sql queries are included, this will use the `batchExecuteStatement` API.
     * Therefore, if any statement fails, the entire transaction is rolled back.
     * * If a single SQL statement is to be executed, this will use the `executeStatement` API.
     */
    override fun sql(sql: List<String>) {
      cdkBuilder.sql(sql)
    }

    /**
     * @param sql The SQL queries to be executed. 
     * Each query is run sequentially within a single transaction; the next query in the array will
     * only execute after the previous one has successfully completed.
     *
     * * When multiple sql queries are included, this will use the `batchExecuteStatement` API.
     * Therefore, if any statement fails, the entire transaction is rolled back.
     * * If a single SQL statement is to be executed, this will use the `executeStatement` API.
     */
    override fun sql(vararg sql: String): Unit = sql(sql.toList())

    /**
     * @param statementName The name of the SQL statement.
     * You can name the SQL statement for identitfication purposes. If you would like Amazon
     * Redshift to identify the Event Bridge rule, and present it in the Amazon Redshift console,
     * append a `QS2-` prefix to the statement name.
     */
    override fun statementName(statementName: String) {
      cdkBuilder.statementName(statementName)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.RedshiftQueryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.targets.RedshiftQueryProps,
  ) : CdkObject(cdkObject),
      RedshiftQueryProps {
    /**
     * The Amazon Redshift database to run the query against.
     */
    override fun database(): String = unwrap(this).getDatabase()

    /**
     * The Amazon Redshift database user to run the query as.
     *
     * This is required when authenticating via temporary credentials.
     *
     * Default: - No Database user is specified
     */
    override fun dbUser(): String? = unwrap(this).getDbUser()

    /**
     * The queue to be used as dead letter queue.
     *
     * Default: - No dead letter queue is specified
     */
    override fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

    /**
     * The input to the state machine execution.
     *
     * Default: - the entire EventBridge event
     */
    override fun input(): RuleTargetInput? = unwrap(this).getInput()?.let(RuleTargetInput::wrap)

    /**
     * The IAM role to be used to execute the SQL statement.
     *
     * Default: - a new role will be created.
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * The secret containing the password for the database user.
     *
     * This is required when authenticating via Secrets Manager.
     * If the full secret ARN is not specified, this will instead use the secret name.
     *
     * Default: - No secret is specified
     */
    override fun secret(): ISecret? = unwrap(this).getSecret()?.let(ISecret::wrap)

    /**
     * Should an event be sent back to Event Bridge when the SQL statement is executed.
     *
     * Default: false
     */
    override fun sendEventBridgeEvent(): Boolean? = unwrap(this).getSendEventBridgeEvent()

    /**
     * The SQL queries to be executed.
     *
     * Each query is run sequentially within a single transaction; the next query in the array will
     * only execute after the previous one has successfully completed.
     *
     * * When multiple sql queries are included, this will use the `batchExecuteStatement` API.
     * Therefore, if any statement fails, the entire transaction is rolled back.
     * * If a single SQL statement is to be executed, this will use the `executeStatement` API.
     *
     * Default: - No SQL query is specified
     */
    override fun sql(): List<String> = unwrap(this).getSql()

    /**
     * The name of the SQL statement.
     *
     * You can name the SQL statement for identitfication purposes. If you would like Amazon
     * Redshift to identify the Event Bridge rule, and present it in the Amazon Redshift console,
     * append a `QS2-` prefix to the statement name.
     *
     * Default: - No statement name is specified
     */
    override fun statementName(): String? = unwrap(this).getStatementName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RedshiftQueryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.RedshiftQueryProps):
        RedshiftQueryProps = CdkObjectWrappers.wrap(cdkObject) as? RedshiftQueryProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RedshiftQueryProps):
        software.amazon.awscdk.services.events.targets.RedshiftQueryProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.targets.RedshiftQueryProps
  }
}
