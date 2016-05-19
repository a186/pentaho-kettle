/*!
 * Copyright 2010 - 2015 Pentaho Corporation.  All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.pentaho.di.ui.repository.pur.repositoryexplorer.uisupport;

import org.pentaho.di.ui.repository.pur.repositoryexplorer.IUIEEUser;
import org.pentaho.di.ui.repository.pur.repositoryexplorer.controller.TrashBrowseController;
import org.pentaho.di.ui.repository.repositoryexplorer.uisupport.AbstractRepositoryExplorerUISupport;
import org.pentaho.di.ui.repository.repositoryexplorer.uisupport.RepositoryExplorerDefaultXulOverlay;

public class TrashUISupport extends AbstractRepositoryExplorerUISupport implements java.io.Serializable {

  private static final long serialVersionUID = -2216932367290742613L; /* EESOURCE: UPDATE SERIALVERUID */

  @Override
  protected void setup() {
    TrashBrowseController deleteController = new TrashBrowseController();
    handlers.add( deleteController );
    overlays.add( new RepositoryExplorerDefaultXulOverlay(
        "org/pentaho/di/ui/repository/pur/repositoryexplorer/xul/trash-overlay.xul", IUIEEUser.class ) ); //$NON-NLS-1$
  }

}
