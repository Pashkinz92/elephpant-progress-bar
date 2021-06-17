package pashkinz92.sosivio;

import com.intellij.ide.ui.LafManager;
import com.intellij.ide.ui.LafManagerListener;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class SosivioApplicationComponent implements LafManagerListener {
    public void lookAndFeelChanged(@NotNull LafManager source) {
        updateProgressBarUi();
    }

    private void updateProgressBarUi() {
        UIManager.put("ProgressBarUI", SosivioProgressBarUi.class.getName());
        UIManager.getDefaults().put(SosivioProgressBarUi.class.getName(), SosivioProgressBarUi.class);
    }
}
